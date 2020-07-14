class Stop 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		t.start();
		System.out.println("Hello World!");
	//t.stop();
t.suspend();
		System.out.println("Hello World!");
		t.resume();

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

