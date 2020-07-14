//overriding the start()
class MyThreadDemo  extends Thread
{
public void start()
	{
	super.start();
	System.out.println("start method");
	}
public void run()
	{
	System.out.println("run method");
	}
}

	class ThreadDemo2
	{
	
	public static void main(String[] args) 
	{
MyThreadDemo t=new MyThreadDemo();
t.start();
		System.out.println("Hello World!");
	}
}
