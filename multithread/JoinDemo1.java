class Test extends Thread 
{static Thread tm ;
	public void run()
	{		
		try
		{    
			tm.join();

		}
		catch (InterruptedException e)
		{
		}for (int i=0;i<10 ;i++ )
		{
		System.out.println("join demo");
		
		}
}
}
class JoinDemo1
{
	public static void main(String[] args) throws InterruptedException
	{ 
		Test.tm=Thread.currentThread();
		Test t=new Test();
		t.start();
		t.join();
		for (int i=0;i<10 ;i++ )
		{
					System.out.println("main method");
		}
		Thread.sleep(1000);
	}
}
