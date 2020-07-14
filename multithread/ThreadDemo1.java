class MyThreadDemo  extends Thread
{
public void run()
	{
	System.out.println("run method");
	}
public void run(int i)
	{
	System.out.println("override");
	}
}

	class ThreadDemo1
	{
	
	public static void main(String[] args) 
	{
MyThreadDemo t=new MyThreadDemo();
t.start();
		System.out.println("Hello World!");
	}
}
