class MyThreadDemo  extends Thread
{
public void run()
	{
	System.out.println("run method");
	}

	

}

	class ThreadDemo3
	{
	
	public static void main(String[] args) 
	{
MyThreadDemo t=new MyThreadDemo();
//t.run();
t.start();
t.start();
		System.out.println("Hello World!");
	}
}
