// test given number is below 10 or not
import java.util.*;
interface A
{

	public boolean test(int x);
}

public class PredicateNotLambda 
{
//public boolean test(int t)
	//{
//if(t<10)
	//return true;
//else if(t==10)
	//return true;
//else
	//return false;
	//}
	public static void main(String[] args) 
	{

	A a=xb->xb>10;
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a number");
	int x=sn.nextInt();
	boolean b=a.test(x);
	System.out.println(b);
		}
}
