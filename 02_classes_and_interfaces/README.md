# Classes and Interfaces

Effective use of classes and interfaces. 
These concepts can be applied to Javascript classes, and shown how other JVM languages
have improved themselves to apply them naturally.

## Item 13: Minimize the accessibility of classes and members.

#### Rule of thimb: Make each class of member as innaccessible as possible.

All protected and public elements of a class immediately become members of the Application 
API and require support forever, considering special care of usage in other systems.

Having classes and members as private or package-private is useful to make them part of
the implementation, nor the API. This concept can be also applied to Javascript as in the 
following snippet (variables x and y are kept as pseudo private in the function closure):

```javascript
function fun(args) {
  var x = args.x;
  var y = doSomething(args);
 
  // Do something with the hidden variables.
  return (function() { ... x + y ... });
}
```

#### Instance fields should never be public.

Classes with public mutable fields are not thread safe. The classic example is having
Arrays as public constants:

```java
public static final Foo[] VALUES = { ... };
```

This could be effectively transformed into:

```java
private static final Foo[] VALUES = { ... };
public static final Foo[] values() { return VALUES.clone(); }
```

## Item 14: In public classes, use accessor methods, not public fields.

Even if a class could represent a simple state of an element as an immutable object as:

```java
class Point {
    public final double x;
    public final double y;
}
```

It becomes questionable because of the implementation itself is not encapsulated, and
the direct use of the variables could limit scalability of the class for future
improvements.

However, if a class is package-private or private nested class, there is nothing inherently
wrong with exposing its data fields, as they belong to the implementation and not the API.

## Item 15: Minimize Mutability.

Immutable classes are less prone error, more secure, and easier to use and maintain than
mutable ones, specially in concurrent operations.

There are some rules to follow when creating immutable classes:

* Don't provide any method that modify object state (mutators).
* Ensure that the class can't be extended. Any subclass could compromise the immutability
of the object. This can be done making the class final.
* Make all the fields final. This helps in objects pass between threads without
synchronization.
* Make all fields private. This helps limiting the access to internal mutable objects.
* Ensure exclusive access to any mutable components. Also, making defensive copies in
constructors, accessors and _readObject_ (serialization) for these mutable components 
will ensure the immutability.

Another simple rule is that Immutable objects are simple, representing a state in time of
an object. In concurrent operations, they are inherently thread-safe, requiring no 
synchronization, and can be shared freely: This discards the need of defensive copies of
immutable objects.

Immutable objects provide other advantages: Their internals can be shared (as for example
the BigInteger sign magnitude), or you can maintain big systems easier with the fact that
a complex object will not change. The only disadvantage is that for every distinct value
you will require a separate instance. This could result in performance leakage or memory
space required (imagine a for-loop with a million of BigInteger objects).

Two strategies can deal with this situation: One is to use primitives internally to improve
performance and encapsulate the hardness of usage with package-private classes (as 
BigInteger for certain operations that require intermediate steps). The other approach is
to provide explicitly a mutable class to perform multistep operations and then finalize
the operations with a method providing the immutable class. The perfect example of this
is the companion classes StringBuilder and StringBuffer for a Java String.

To summarize, Classes should be immutable unless there's a very good reason to make them
mutable. If the class immutability is impractical, limit the mutability as much as possible,
and make every field final unless there is a good reason to make it nonfinal.

# Item 16: Favor composition over inheritance.

A common problem with Inheritance is that a subclass needs some details about parent
class implementation to properly work. A typical example in Java is the forcing of fields
be _protected_ only for the usage in the subclass. This expands the support that a class
needs in terms of accessibility: some of the fields proper to an implementation will be
protected only for the needs of a subclass.

```java
// Broken - Inappropriate use of inheritance!
public class InstrumentedHashSet<E> extends HashSet<E> {
  
  // The number of attempted element insertions
  private int addCount = 0;
  public InstrumentedHashSet() {
  }
  
  public InstrumentedHashSet(int initCap, float loadFactor) {
    super(initCap, loadFactor);
  }
  
  @Override public boolean add(E e) {
    addCount++;
    return super.add(e);
  }

  @Override public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    return super.addAll(c);
  }
  
  public int getAddCount() {
    return addCount;
  }
}
```

This is an example when the details of an implementation (in this case the size and add
methods) needs to be known for the subclass to properly work. In this particular example,
the getAddCount method will return 6 instead of 3 because of double counting in the 
addCount internal variable: Internally addAll uses .

A good approach is to make the super class a member of the extended class, 

