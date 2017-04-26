# Methods common to all objects

Chapter 3

+++
### Items

- Item 8: Obey the general contract when overriding `equals`
- Item 9: Always override `hashCode` when you override `equals`
- Item 10: Always override `toString`
- Item 11: Override `clone` judiciously
- Item 12: Consider implementing `Comparable`

+++
### Item 8: Obey the general contract when overriding equals

- The equals method implements an _equivalence relation._ It is:
- _Reflexive_                `equals(x)==true`
- _Symmetric_                `equals(y) == y.equals(x)`
- _Transitive_                `equals(y)  == y.equals(z) == x.equals(z)`
- _Consistent_                `x.equals(y) == x.equals(y) == x.equals(y)`
- For any non-null reference value `x`, `equals(null)` must return `false`.

+++
### Item 9: Always override `hashCode` when you override equals

- You must override `hashCode` in every class that overrides equals

- `hashCode` method must consistently return the same integer
- equal objects must have equal hash codes
- For two objects unequal according to the `equals(Object)` method, the `hashCode` method on each of the two objects may not produce distinct integer results.

+++
### A good hash function
- **Deterministic** — equal keys must produce the same hash value.

- **Efficient** to compute.

- uniformly **distribute** the keys.

+++
### Item 10: Always override toString

- The returned string should be 
>a concise but informative representation that is easy for a person to read.
>It is recommended that all subclasses override this method.
- When practical, the `toString` method should return all of the interesting information contained in the object, self-explanatory.
- Decide whether to specify the format of the return value (for _value classes_), and clearly document your intentions.
- Provide programmatic access to all of the information contained in the value returned by `toString`

+++
### Item 11: Override clone judiciously

- Object's `clone` method is `protected`
- All classes that implement `Cloneable` should override clone with a public method whose return type is the class itself.
- If a class implements `Cloneable`, Object's clone method returns a field-by-field copy of the object; otherwise it throws `CloneNotSupportedException`
- Copying an object will typically entail creating a new instance of its class, but it may require copying of internal data structures as well.
- Incompatible with normal use of final fields referring to mutable objects
- not absolute requirements:

- `clone() != x == true`
- `(x.clone().getClass() == x.getClass()) == true`
- `clone().equals(x) == true`

- if you override the clone method in a nonfinal class, you should return an object obtained by invoking clone.
- it must copy the internals of the object and call clone recursively on mutable objects:

		@Override public Stack clone() {

		try {

		Stack result = (Stack) super.clone();

		result.elements = elements.clone();

		return result;

		} catch (CloneNotSupportedException e) {

		        throw new AssertionError();

		}

		}

- It is not always sufficient to call clone recursively, might need to support a &quot;deep copy&quot; method

+++
- A fine approach to object copying is to provide a _copy constructor_ r _copy factory_.

		public Yum(Yum yum);
		public static Yum newInstance(Yum yum);

- A copy constructor or factory can take an argument whose type is an interface implemented by the class, called _conversion constructors_ and _conversion factories_.

		HashSet s;
		TreeSet ts = new TreeSet(s).

+++
### Item 12: Consider implementing Comparable

- By implementing `Comparable`, a class indicates that its instances have a _natural ordering._
- it permits order comparisons in addition to simple equality comparisons
- it is generic
		public interface Comparable<T> {

		int compareTo(T t);

		}
- Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
- Throws `ClassCastException` if the specified object's type prevents it from being compared to this object.



- Classes that depend on comparison include

- the sorted collections `TreeSet` and `TreeMap`
- the utility classes `Collections`
- and `Arrays`, which contain searching and sorting algorithms.

- If a class has multiple significant fields, the order in which you compare them is critical.

		public int compareTo(PhoneNumber pn) {
			// Compare area codes
			if (areaCode < pn.areaCode)
			return -1;
			if (areaCode > pn.areaCode)
			return 1;
			// Area codes are equal, compare prefixes
			if (prefix < pn.prefix)
			return -1;
			if (prefix > pn.prefix)
			return 1;
			return 0; // All fields are equal
		}
