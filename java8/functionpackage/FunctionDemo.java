import java.util.function.*;
class FunctionDemo 
{
	public static void main(String[] args) 
	{
		Function<String,Integer> f=(String s)->s.length();
		System.out.println("length of the string:  "+f.apply("praneeth"));
		System.out.println("Hello World!");
	}
}
