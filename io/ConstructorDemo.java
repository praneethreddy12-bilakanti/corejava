class ConstructorDemo implements Cloneable
{
	int x;
	ConstructorDemo(int y)
	{
		x=y;
		System.out.println("this is construor"+x);
	}
	public void sum(int x,int y)
	{
	System.out.println("sum is"+(x+y));}

	public static void main(String[] args) throws Exception
	{
		ConstructorDemo d=new ConstructorDemo(1);

		System.out.println(d.x);
		ConstructorDemo d2=(ConstructorDemo)d.clone();
				System.out.println(d2.x);
d.sum(10,30);
		System.out.println("Hello World!");
	}
}
