import java.util.function.*;
class PredicateDemo4
{
	public static void main(String[] args) 
	{
		Predicate<String> p=s->s.contentEquals("praneeth reddy");
		System.out.println("Hello World!"+p.test("praneeth reddy"));
	}
}
