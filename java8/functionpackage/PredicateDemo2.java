// given string is equal or not?
import java.util.function.*;
public class PredicateDemo2 
{
	public static void main(String[] args) 
	{
Predicate<String> p=s->s.equals("praneeth");

		System.out.println("comparing string \t"+p.test("praneeth"));
	}
}
