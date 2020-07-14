class Test extends Thread
{
public void run()
	{

System.out.println("run method");
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
//Thread.currentThread().setPriority(7);
	}

}

class FirstThreadDemo 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.start();
		t.setPriority(7);
		System.out.println("Hello World!");
		System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
}
}
