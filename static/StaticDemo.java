class StaticDemo 
{
	static int x=10;//1(x=0)--------'//x=10--------7
	static//2
	{
System.out.println("x:"+x);//10---------------8
	}
	public static void m1()//5
	{
	System.out.println("m1");
	System.out.println("m1"+y);
	}
	public static void main(String[] args)//6 
	{
		m1();
		System.out.println("Hello World!");
	}
	static//3
	{
		System.out.println("ssss");//ssssssssss-------------9
	}
	static int y=19;//4(y=0)//19----------------------10
}
