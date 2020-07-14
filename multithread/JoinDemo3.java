class JoinDemo3 
{
	public static void main(String[] args) throws Exception
	{
		Thread.currentThread().join();
		System.out.println("Hello World!");
	}
}
