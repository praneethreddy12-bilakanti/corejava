class MyThreadDemo  implements Runnable
{
public void run()
	{
	
	System.out.println("run method");
	}
}

	class ThreadDemo4
	{
	
	public static void main(String[] args) 
	{
MyThreadDemo t1=new MyThreadDemo();
Thread t=new Thread(t1);
t.run();
t.start();
//t.start();
		System.out.println("Hello World!");
	}
}
