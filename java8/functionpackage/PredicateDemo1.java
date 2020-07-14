//to check the given the odd number or not
import java.util.function.*;
class PredicateDemo1 
{
	public static void main(String[] args) 
	{
		Predicate <Integer> p=x->x%2!=0;
		System.out.println("predicate function for odd number or not"+p.test(10));
	}
}
