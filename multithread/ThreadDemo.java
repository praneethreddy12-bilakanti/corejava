class MyThreadDemo  extends Thread//thread schedular
{
public void run()//job of thread 
	{
	System.out.println("run method");
	}

	

}

	class ThreadDemo
	{
	
	public static void main(String[] args) 
	{
MyThreadDemo t=new MyThreadDemo();//intialisng
t.start();//starting
		System.out.println("Hello World!");
	}
}
