class Display
{
	public  void wish( String name)
	{
			System.out.println("hi........................................");

synchronized(this)
			{
	try
{
		for (int i=0;i<10 ;i++ )
		{
			Thread.sleep(1000);

			System.out.println("good mrng"+name);
		}
	
}
catch (Exception e)
{
}
		}
	}
}

class Demo1 extends Thread
{
Display d;
String name;
Demo1(Display d,String name)
	{
this.d=d;
this.name=name;
	}
	public void run()
	{

		d.wish(name);
}
}
class Demo2 extends Thread
{
Display d;
String name;
 Demo2(Display d,String name)
	{
this.d=d;
this.name=name;
	}
	public void run()
	{

		d.wish(name);
}
}
public class SynWish
{
	public static void main(String[] args)throws Exception
	{
Display d=new Display();
Demo1 d1=new Demo1(d,"praneeth");
Demo2 d2=new Demo2(d,"ravi");
d1.start();
d2.start();
	}
}