/**
Java String compare
here are three ways to compare string in java:

1)By equals() method
2)By = = operator
3)By compareTo() method

 String compare by equals() method

The String equals() method compares the original content of the string.
It compares values of string for equality. String class provides two methods:

public boolean equals(Object another) compares this string to the specified object.
public boolean equalsIgnoreCase(String another)compares this String to another string, ignoring case.
**/
class Teststringcomparison1
	{  
 public static void main(String args[])
	 {  
	 int x=3;
	 int y=3;
	 Teststringcomparison1 t2=new Teststringcomparison1();
	 Teststringcomparison1 t1= new Teststringcomparison1();

   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
   System.out.println(s1==s2);//true
   System.out.println(x==y);//true  
   //System.out.println(x.hashCode());  //we cant create object seperatly to the int vlaues
      //System.out.println(y.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s1.hashCode());
  System.out.println(t2.hashCode());
      System.out.println(t1.hashCode());

	  String s="SACHIN";  
  
   System.out.println(s1.equals(s));//false  
   System.out.println(s1.equalsIgnoreCase(s));//true  


 }  
}  