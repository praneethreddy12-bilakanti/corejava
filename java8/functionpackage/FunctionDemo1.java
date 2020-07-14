import java.util.function.*;
public class FunctionDemo1
{
	public static void main(String[] args) 
	{
		Function<String,String> f=s-> s.substring(0,8);
		Function<String,String> f1=s->s.toUpperCase();
		
		//System.out.println("uppercase String :   "+f.apply("praneeth"));
		System.out.println("length and uppercase String :   "+f.andThen(f1).apply("praneeth kumar reddy"));
	}
}
