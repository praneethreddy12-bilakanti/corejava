//to check the given number is divide by the 2 or no?

import java.util.function.*;
class PredicateDemo 
{
	public static void main(String[] args) 
	{
Predicate<Integer> p=(x)->x%2==0;

		System.out.println("predicate function"+p.test(10));
	}
}
