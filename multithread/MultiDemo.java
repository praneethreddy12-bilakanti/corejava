
class Test extends Thread
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{		super.start();

		for (int i=0; i<10; i++)
		{
					System.out.println("run method");

		}
	}
}
class MultiDemo 
{
	public static void main(String[] args) 
	{
		Test t =new Test();
		t.start();
		for (int i=0;i<10 ;i++ )
		{
					System.out.println("Hello World!");

		}
	}
}
