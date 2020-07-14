class SleepDemo extends Thread 
{
	public void run() 
	{
		for (int i=0;i<10 ;i++ )
		{
			try
			{
				
				Thread.sleep(500);
			System.out.println(i);
			
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}
	public static void main(String[] args) 
	{
		SleepDemo d1=new SleepDemo();
		SleepDemo d2=new SleepDemo();
	d1.start();
	//d2.start();
		System.out.println("Hello World!");
	}
}
