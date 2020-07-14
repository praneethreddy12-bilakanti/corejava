class NegitiveDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			int x[]=new int[-5];
			System.out.println(x[-1]);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}
