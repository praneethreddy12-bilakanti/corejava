import java.util.function.*;
class PredicateJoin2
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p1=( x)->x<=10;
		Predicate<Integer> p2=( x)->x%2==0;
		Predicate<Integer> p3=p2.or(p1);

		System.out.println("predicate   :  "+p3.test(100));
	}
}
