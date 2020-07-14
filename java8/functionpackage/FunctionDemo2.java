import java.util.function.*;
public class FunctionDemo2
{
	public static void main(String[] args) 
	{
		Function<String,String> f=s->s.toUpperCase();
		System.out.println("uppercase String :   "+f.apply("praneeth"));
	}
}
