class Test extends Thread 
{
	public void run()
	{
		for (int i=0;i<10 ;i++ )
		{
		System.out.println("join demo");
		
		}
}
}
class JoinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		Test t=new Test();
		t.start();
		t.join();
		for (int i=0;i<10 ;i++ )
		{
					System.out.println("main method");
		}
	}
}
