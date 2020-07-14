
// test given number is below 10 or not
import java.util.*;
interface A
{

	public boolean test(int x);
}

public class PredicateNot implements A
{
public boolean test(int t)
	{
if(t<10)
	return true;
else if(t==10)
	return true;
else
	return false;
	}
	public static void main(String[] args) 
	{
	PredicateNot pn=new PredicateNot();
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a number");
	int x=sn.nextInt();
	boolean b=pn.test(x);
	if(b==true)
		System.out.println("given number is equl or 10");
else
	System.out.println(" not below the 10");
		
		
	}
}
