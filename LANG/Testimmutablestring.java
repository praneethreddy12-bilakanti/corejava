/**
In java, string objects are immutable. 
Immutable simply means unmodifiable or unchangeable.
Once string object is created 
its data or state can't be changed but a new string object is created.
**/
class Testimmutablestring 
	
	{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
String s1="praneeth";
String s2="reddy";
String s3=s1.concat(s2);
System.out.println(s3);
 
 
 
 
 }  
}  
