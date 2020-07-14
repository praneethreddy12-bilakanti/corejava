class Deamon 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println(Thread.currentThread().isDaemon());
		t.setDaemon(true);
		t.start();
		System.out.println("Hello World!");
		System.out.println(t.isDaemon());
			//	System.out.println("Hello World!");

	}
}
class Test extends Thread
{
	public void run()
	{
		for (int i=0;i<=10 ;i++ )
		{
			System.out.println("chaild thread");
		}
}
}

