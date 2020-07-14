// given string is start with p or not
import java.util.function.*;
public class PredicateDemo3
{
	public static void main(String[] args) 
	{
Predicate<String> p=s->s.startsWith("p");
		System.out.println("startting string \t"+p.test("raneeth"));
	}
}
