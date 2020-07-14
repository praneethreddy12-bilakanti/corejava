class StringIndexOutOfBoundsExceptionDemo 
{
	public static void main(String[] args) 
	{
try
{
String s="praneeth";
System.out.println(s.charAt(-44));

}
catch (StringIndexOutOfBoundsException e)
{
	System.out.println("charposition"+e);
}
		System.out.println("Hello World!");
	}
}
