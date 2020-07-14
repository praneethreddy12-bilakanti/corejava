/**
String compare by == operator


The = = operator compares references not values.
**/
class Teststringcomparison3
	{  
 public static void main(String args[])
	 {  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Ratanty";  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 System.out.println(s2.hashCode());
      System.out.println(s3.hashCode());
 System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s4));//1(because s1>s3)  
   System.out.println(s4.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  