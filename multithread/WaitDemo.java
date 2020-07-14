class WaitDemo 
{
	public static void main(String[] args) throws Exception
	{
		Demo d=new Demo();
		d.start();
		d.wait();
		System.out.println(d.total);
		System.out.println("Hello World!");
	}
}
class Demo extends Thread
{
	int total=0;
	public void run()
	{
	for (int i=0;i<=10 ;i++ )
	{
		total+=i;
		this.notify();
	}
	System.out.println("sum"+total);
}
}
