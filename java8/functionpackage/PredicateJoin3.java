import java.util.function.*;
class PredicateJoin3
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p1=( x)->x<=10;
		Predicate<Integer> p2=p1.negate();

		System.out.println("predicate   :  "+p2.test(100));
	}
}
