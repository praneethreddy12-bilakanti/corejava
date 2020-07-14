class StaticDemo3
{
			static int x=m1();//0

	static
	{
		System.out.println("x::::::::::::::::::::::::::"+x);
	m1();
	}
public static int m1()
	{
System.out.println("m1 method::::::::::::::::::::::::::"+x);
	
	return 100;}
	public static void main(String [] args)
	{
	}
}
