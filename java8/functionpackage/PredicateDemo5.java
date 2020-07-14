// to check the length of the string greater the 5
import java.util.function.*;
class  PredicateDemo5
{
	public static void main(String[] args) 
	{

		Predicate<String> p=(String s)->s.length()>5;
		System.out.println("Hello World!"+p.test("praneeth"));
	}
}
