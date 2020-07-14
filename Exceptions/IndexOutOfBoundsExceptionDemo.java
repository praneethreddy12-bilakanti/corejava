class IndexOutOfBoundsExceptionDemo 
{
	public static void main(String[] args) 
	{
	/*
try
{	
int[] x={10,10,10,10,10,10,1,0};
System.out.println(x[-1]);
}
catch(IndexOutOfBoundsException e)
		{
	e.printStackTrace();
		}*/


try
{
	String[] s={"pranetth","jfjjf","fjffkkf","kfk"};
	System.out.println(s[-1]);
}
catch (Exception e)
{
	e.printStackTrace();
}
	}
}
