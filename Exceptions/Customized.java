class Customized 
{
	public static void main(String[] args)throws Exception
	{
		int age=Integer.parseInt(args[0]);
		if (age>18)
		{
			throw new Above("eligible for voter id");
		}
		else
		{
			throw new Below("not eligble");
		} 
	}
}
class Above extends Exception
{
	Above(String s)
	{
		super(s);
	}
}
class Below extends Exception
{
	Below(String s)
	{
		super(s);
	}
}
