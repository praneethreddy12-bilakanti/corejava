class Test extends Thread
{
public void run()
{
	System.out.println("Test run");
}
}class Test1 extends Thread
{
public void run()
{
	System.out.println("Test 1run");
}

}

public class MultiTskMultiPerson
{

	public static void main(String[] args) 
	{
	Test1 t1=new Test1();
	Test t= new Test();
	
		t.start();
		t1.start();
			

	}
}
