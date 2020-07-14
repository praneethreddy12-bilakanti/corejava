import java.util.function.*;
public class FunctionDemo3
{
	public static void main(String[] args) 
	{
		Function<String,String> f=s->
		{
			
			System.out.println(s);
			String sub=s.substring(0,8);
			
			System.out.println(sub);
			return sub;
		};
		Function<String,String> f1=s->
		{
			String up=s.toUpperCase();
			System.out.println(up);
			return up;
		};
		System.out.println("sub  and uppercase String :   "+f.compose(f1).apply("praneeth kumar reddy"));
	}
}
