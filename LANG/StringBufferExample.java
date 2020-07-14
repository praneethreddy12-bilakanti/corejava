
Java StringBuffer class 

Java StringBuffer class is used to create mutable (modifiable) string. 
The StringBuffer class in java is same as String class except it is mutable i.e. 
it can be changed.

Note: Java StringBuffer class is thread-safe i.e.
multiple threads cannot access it simultaneously. So it is safe and will result in an order.
A string that can be modified or changed is known as mutable string.
StringBuffer and StringBuilder classes are used for creating mutable string.
Modifier and Type for  StringBuffer  is public synchronized StringBuffer.

constructors
-->(StringBuffer()
-->(StringBuffer(String str)
-->(StringBuffer(int capacity)
methods

-->append()
-->replace()
-->insert()
-->capacity()
-->length()
-->reverse()
-->delete()
 

 class StringBufferExample
 {
	 public static void main(String[]args)
	 {
StringBuffer sb=new StringBuffer("hello");
sb.append("praneeth");
System.out.println(sb);
sb.insert(4,"reddy");
System.out.println(sb);
sb.replace(0,5,"reddy");
System.out.println(sb);
sb.delete(5,10);
System.out.println(sb);
System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb.reverse());







	 }

 }