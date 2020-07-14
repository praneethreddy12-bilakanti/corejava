class StaticDemo1
{
	static int x=10;//1(x=0)--------'//x=10--------7
	static//2
	{
System.out.println("x:"+x);//10---------------8
	m2();
	}
	public static void m1()//5
	{
	System.out.println("m1:::::::::::::::::::::::::::::::::::::"+x);
	System.out.println("m2:::::::::::::::::::::::::::::::::::"+y);
	}
	public static void main(String[] args)//6 
	{
		m1();
		System.out.println("Hello World!");
	}
	static//3
	{
		System.out.println("ssss");
	}
	static int y=19;//4(y=0)//19----------------------10
	public static void m2()//5
	{
	System.out.println("m2:::::::::::::::::::::"+y);
}
}