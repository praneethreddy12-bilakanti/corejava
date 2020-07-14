class ClassCastExceptionDemo 
{
	public static void main(String[] args) 
	{
		String s="anu";
		System.out.println(s);
		Object o =(Object)s;
		System.out.println(o);
		String s1=(String)o;
System.out.println(s1);

		try
		{
			Object o1=new Object();
System.out.println(o1);
String s2=(String)o1;
System.out.println(s2);
		}
		catch (ClassCastException e)
		{
			System.out.println(e);
		}
		finally
		{System.out.println("directly executed");
		}
		System.out.println("Hello World!");
	}
}
