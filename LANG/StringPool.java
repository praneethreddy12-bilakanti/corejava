/**
How to create String object?
There are two ways to create String object:
-->By string literal
-->By new keyword
1) String Literal
Java String literal is created by using double quotes. For Example:

String s="welcome";  
Each time you create a string literal, the JVM checks the string constant pool first. If the string already exists in the pool, a reference to the pooled instance is returned. If string doesn't exist in the pool, a new string instance is created and placed in the pool. For example:

String s1="Welcome";  
String s2="Welcome";//will not create new instance  
java string literal
In the above example only one object will be created. Firstly JVM will not find any string object with the value "Welcome" in string constant pool, so it will create a new object. After that it will find the string with the value "Welcome" in the pool, it will not create new object but will return the reference to the same instance.

Note: String objects are stored in a special memory area known as string constant pool.
Why java uses concept of string literal?
To make Java more memory efficient (because no new objects are created if it exists already in string constant pool).

2) By new keyword
String s=new String("Welcome");//creates two objects and one reference variable  
In such case, JVM will create a new string object in normal(non pool) heap memory and the literal "Welcome" will be placed in the string constant pool. The variable s will refer to the object in heap(non pool).

**/

class   StringPool
{
	public static void main(String[] args) 
	{
		String s1="Welcome";  
String s2="Welcome";
String s=new String("Welcome");
String s3=new String("Welcome");
		System.out.println("Hello World!");
	System.out.println(s1);
System.out.println(s);
System.out.println(s.hashCode());
		
		System.out.println(s3);
System.out.println(s3.hashCode());
System.out.println(s2);
			System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
	}


}
