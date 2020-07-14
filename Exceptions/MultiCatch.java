class MultiCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		
		catch (ArithmeticException | NullPointerException e)
		{
			e.printStackTrace();
		}
/*
//MultiCatch.java:15: error: Alternatives in a multi-catch statement cannot be related by subclassing
catch (ArithmeticException | Exception e)
                             ^
  Alternative ArithmeticException is a subclass of alternative Exception
1 error
catch (ArithmeticException | Exception e)
		{
			e.printStackTrace();
		}
		*/
		System.out.println("Hello World!");
	}
}
