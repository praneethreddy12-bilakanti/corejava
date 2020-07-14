
/**
Java StringBuilder class 
Java StringBuilder class is used to create mutable (modifiable) string.
The Java StringBuilder  is same as StringBuffer  except that it is non-synchronized. 
It is available since JDK 1.5.
Constructor:
-->StringBuilder()
-->StringBuilder(String str)
-->StringBuilder(int length)
Method
1)append(String s)	
2) insert(int offset, String s)
3)replace(int startIndex, int endIndex, String str)
4) delete(int startIndex, int endIndex)
5)reverse()
6)int capacity()
7)void ensureCapacity(int minimumCapacity)
8)char charAt(int index)
9)public int length()	
10)substring(int beginIndex)
11)substring(int beginIndex, int endIndex)

**/

 class StringBuilderExample
 {
	 public static void main(String[]args)
	 {
StringBuilder sb=new StringBuilder("hello");
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