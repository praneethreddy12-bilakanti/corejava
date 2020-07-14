class Test 
{
public  synchronized void printTable(int n,String name)
	{
	for(int i=1;i<=10;i++)
		{

System.out.println( "table "+(n*i)+" "+name);
		}
	}
}
class MyThread1 extends Thread
{
	Test t;
	String name;
MyThread1( Test t,	String name)
{
	this.t=t;
	this.name=name;
}

	public void run()
	{
		t.printTable(4,name);
	}
}
class MyThread2 extends Thread
{
Test t;
 String name;

MyThread2( Test t,	String name)
{
	this.t=t;
	this.name=name;

}

	public void run()
	{
t.printTable(49,name);
}
}
public class SynchDemo
{
	public static void main(String[] args)
	{
		Test t=new Test();
		MyThread1 t1=new MyThread1(t,"praneeth");
		MyThread2 t2=new MyThread2(t,"reddy");
		t1.start();
		t2.start();
	}
}