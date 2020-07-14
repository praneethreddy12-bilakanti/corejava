import java.util.function.*;
class PredicateFinal 
{
	public static void main(String[] args) 
	{
int[] x={10,20,39,50,58,12};
Predicate<Integer> p1=(y)->y<30;
Predicate<Integer> p2=(y)->y%2==0;
System.out.println("the values are less then 30 is");
System.out.println(".....................................");
m1(p1,x);
System.out.println("even numbers in the given array");
System.out.println(".........................");
m1(p2,x);
System.out.println("even numbers in the given array and below the 30");
System.out.println(".........................");
m1(p1.and(p2),x);
System.out.println("the given array and above the 30");
System.out.println(".........................");
m1(p1.negate(),x);
	}
public static void m1(Predicate<Integer> p,int[] x)
	{
for(int x1:x)
		{
	if(p.test(x1)) 
			{

		System.out.println(x1);
	}


}
	}}