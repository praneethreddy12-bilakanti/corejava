import java.util.*;
interface A
{
	public void sum(int a, int b);
}

class LambdaDemo2 
{
	public static void main(String[] args) 
	{
A a=(s1,s2)->System.out.println("sum"+(s1+s2));
	

Scanner sn=new Scanner(System.in);
System.out.println("enter first number");
int x=sn.nextInt();
System.out.println("enter secound number");
int y=sn.nextInt();

		a.sum(x,y);
		//System.out.println("sum of 2 numbers:"+a.sum(x,y));

	}
}
