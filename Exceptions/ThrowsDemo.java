class  ThrowsDemo
{
	public static void m1() throws Exception
	{
		System.out.println("m1 method");
	m2();}
	public static void m2() throws Exception
	{
		System.out.println("m2 method");
		Thread.sleep(4000);
		System.out.println("Hello World!");

	}
	
		
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hello World!");
	m1();
	}
}
