# effective-java
Study group of the Effective Java book, with code samples

<a href="https://gitpitch.com/j4Guanatos/effective-java/master">Slides</a>

## AGENDA

<table class="tableizer-table">
<thead></thead><tbody>
 <tr><td>2 Creating and Destroying Objects</td><td>&nbsp;</td></tr>
 <tr><td>Item 1: Consider static factory methods instead of constructors </td><td>Sier</td></tr>
 <tr><td>Item 2: Consider a builder when faced with many constructor parameters</td><td>&nbsp;</td></tr>
 <tr><td>Item 3: Enforce the singleton property with a private constructor or an enum type </td><td>&nbsp;</td></tr>
 <tr><td>Item 4: Enforce noninstantiability with a private constructor </td><td>&nbsp;</td></tr>
 <tr><td>Item 5: Avoid creating unnecessary objects </td><td>&nbsp;</td></tr>
 <tr><td>Item 6: Eliminate obsolete object references</td><td>&nbsp;</td></tr>
 <tr><td>Item 7: Avoid finalizers </td><td>&nbsp;</td></tr>
 <tr><td>3 Methods Common to All Objects</td><td>&nbsp;</td></tr>
 <tr><td>Item 8: Obey the general contract when overriding equals </td><td>Miriam</td></tr>
 <tr><td>Item 9: Always override hashCode when you override equals</td><td>&nbsp;</td></tr>
 <tr><td>Item 10: Always override toString </td><td>&nbsp;</td></tr>
 <tr><td>Item 11: Override clone judiciously </td><td>&nbsp;</td></tr>
 <tr><td>Item 12: Consider implementing Comparable </td><td>&nbsp;</td></tr>
 <tr><td>4 Classes and Interfaces</td><td>&nbsp;</td></tr>
 <tr><td>Item 13: Minimize the accessibility of classes and members</td><td>Ernesto</td></tr>
 <tr><td>Item 14: In public classes, use accessor methods, not public fields </td><td>&nbsp;</td></tr>
 <tr><td>Item 15: Minimize mutability </td><td>&nbsp;</td></tr>
 <tr><td>Item 16: Favor composition over inheritance </td><td>&nbsp;</td></tr>
 <tr><td>Item 17: Design and document for inheritance or else prohibit it </td><td>Dionicio</td></tr>
 <tr><td>Item 18: Prefer interfaces to abstract classes </td><td>&nbsp;</td></tr>
 <tr><td>Item 19: Use interfaces only to define types</td><td>&nbsp;</td></tr>
 <tr><td>Item 20: Prefer class hierarchies to tagged classes </td><td>&nbsp;</td></tr>
 <tr><td>Item 21: Use function objects to represent strategies </td><td>&nbsp;</td></tr>
 <tr><td>Item 22: Favor static member classes over nonstatic </td><td>&nbsp;</td></tr>
 <tr><td>5 Generics </td><td>&nbsp;</td></tr>
 <tr><td>Item 23: Don't use raw types in new code </td><td>Zusscell</td></tr>
 <tr><td>Item 24: Eliminate unchecked warnings</td><td>&nbsp;</td></tr>
 <tr><td>Item 25: Prefer lists to arrays </td><td>&nbsp;</td></tr>
 <tr><td>Item 26: Favor generic types</td><td>&nbsp;</td></tr>
 <tr><td>Item 27: Favor generic methods </td><td>&nbsp;</td></tr>
 <tr><td>Item 28: Use bounded wildcards to increase API flexibility </td><td>&nbsp;</td></tr>
 <tr><td>Item 29: Consider typesafe heterogeneous containers </td><td>&nbsp;</td></tr>
 <tr><td>6 Enums and Annotations </td><td>&nbsp;</td></tr>
 <tr><td>Item 30: Use enums instead of int constants</td><td>Alex</td></tr>
 <tr><td>Item 31: Use instance fields instead of ordinals </td><td>&nbsp;</td></tr>
 <tr><td>Item 32: Use EnumSet instead of bit fields </td><td>&nbsp;</td></tr>
 <tr><td>Item 33: Use EnumMap instead of ordinal indexing</td><td>&nbsp;</td></tr>
 <tr><td>Item 34: Emulate extensible enums with interfaces </td><td>&nbsp;</td></tr>
 <tr><td>Item 35: Prefer annotations to naming patterns </td><td>&nbsp;</td></tr>
 <tr><td>Item 36: Consistently use the Override annotation</td><td>&nbsp;</td></tr>
 <tr><td>Item 37: Use marker interfaces to define types </td><td>&nbsp;</td></tr>
 <tr><td>7 Methods </td><td>&nbsp;</td></tr>
 <tr><td>Item 38: Check parameters for validity </td><td>Pedro</td></tr>
 <tr><td>Item 39: Make defensive copies when needed </td><td>&nbsp;</td></tr>
 <tr><td>Item 40: Design method signatures carefully </td><td>&nbsp;</td></tr>
 <tr><td>Item 41: Use overloading judiciously</td><td>&nbsp;</td></tr>
 <tr><td>Item 42: Use varargs judiciously </td><td>&nbsp;</td></tr>
 <tr><td>Item 43: Return empty arrays or collections, not nulls </td><td>&nbsp;</td></tr>
 <tr><td>Item 44: Write doc comments for all exposed API elements </td><td>&nbsp;</td></tr>
 <tr><td>8 General Programming </td><td>&nbsp;</td></tr>
 <tr><td>Item 45: Minimize the scope of local variables</td><td>Luis</td></tr>
 <tr><td>Item 46: Prefer for-each loops to traditional for loops </td><td>&nbsp;</td></tr>
 <tr><td>Item 47: Know and use the libraries </td><td>&nbsp;</td></tr>
 <tr><td>Item 48: Avoid float and double if exact answers are required</td><td>&nbsp;</td></tr>
 <tr><td>Item 49: Prefer primitive types to boxed primitives </td><td>&nbsp;</td></tr>
 <tr><td>Item 50: Avoid strings where other types are more appropriate </td><td>Dionicio</td></tr>
 <tr><td>Item 51: Beware the performance of string concatenation </td><td>&nbsp;</td></tr>
 <tr><td>Item 52: Refer to objects by their interfaces </td><td>&nbsp;</td></tr>
 <tr><td>Item 53: Prefer interfaces to reflection </td><td>&nbsp;</td></tr>
 <tr><td>Item 54: Use native methods judiciously</td><td>&nbsp;</td></tr>
 <tr><td>Item 55: Optimize judiciously </td><td>&nbsp;</td></tr>
 <tr><td>Item 56: Adhere to generally accepted naming conventions</td><td>&nbsp;</td></tr>
 <tr><td>9 Exceptions </td><td>&nbsp;</td></tr>
 <tr><td>Item 57: Use exceptions only for exceptional conditions </td><td>Miriam</td></tr>
 <tr><td>Item 58: Use checked exceptions for recoverable conditions and runtime exceptions for programming errors</td><td>&nbsp;</td></tr>
 <tr><td>Item 59: Avoid unnecessary use of checked exceptions </td><td>&nbsp;</td></tr>
 <tr><td>Item 60: Favor the use of standard exceptions</td><td>Ernesto</td></tr>
 <tr><td>Item 61: Throw exceptions appropriate to the abstraction</td><td>&nbsp;</td></tr>
 <tr><td>Item 62: Document all exceptions thrown by each method</td><td>&nbsp;</td></tr>
 <tr><td>Item 63: Include failure-capture information in detail messages </td><td>&nbsp;</td></tr>
 <tr><td>Item 64: Strive for failure atomicity </td><td>&nbsp;</td></tr>
 <tr><td>Item 65: Don't ignore exceptions </td><td>&nbsp;</td></tr>
 <tr><td>10 Concurrency</td><td>&nbsp;</td></tr>
 <tr><td>Item 66: Synchronize access to shared mutable data</td><td>Zusscell</td></tr>
 <tr><td>Item 67: Avoid excessive synchronization </td><td>&nbsp;</td></tr>
 <tr><td>Item 68: Prefer executors and tasks to threads</td><td>&nbsp;</td></tr>
 <tr><td>Item 69: Prefer concurrency utilities to wait and notify</td><td>&nbsp;</td></tr>
 <tr><td>Item 70: Document thread safety </td><td>Alex</td></tr>
 <tr><td>Item 71: Use lazy initialization judiciously </td><td>&nbsp;</td></tr>
 <tr><td>Item 72: Don't depend on the thread scheduler </td><td>&nbsp;</td></tr>
 <tr><td>Item 73: Avoid thread groups </td><td>&nbsp;</td></tr>
 <tr><td>11 Serialization </td><td>&nbsp;</td></tr>
 <tr><td>Item 74: Implement Serializable judiciously</td><td>Sier</td></tr>
 <tr><td>Item 75: Consider using a custom serialized form </td><td>&nbsp;</td></tr>
 <tr><td>Item 76: Write readObject methods defensively </td><td>&nbsp;</td></tr>
 <tr><td>Item 77: For instance control, prefer enum types to readResolve </td><td>&nbsp;</td></tr>
 <tr><td>Item 78: Consider serialization proxies instead of serialized instances</td><td></td></tr>
</tbody></table>



# Links
https://word-to-markdown.herokuapp.com/