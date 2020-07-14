import java.util.function.*;
class PredicateJoin1 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p1=( x)->x<=10;
		Predicate<Integer> p2=( x)->x%2==0;
		Predicate<Integer> p3=p1.and(p2);

		System.out.println("predicate   :  "+p3.test(100));
	}
}
