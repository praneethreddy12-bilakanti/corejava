import java.util.*;
interface A
{
	public void display(String name);
}

class LambdaDemo1 
{
	public static void main(String[] args) 
	{
A a=(name)->
		{
	System.out.println("hello world"+name);
		};
Scanner sn=new Scanner(System.in);
System.out.println("enter a name");
String name=sn.next();

		a.display(name);
	}
}
