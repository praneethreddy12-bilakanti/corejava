class WaitDemoSyn1 
{
	public static void main(String[] args) throws Exception
	{
		Demo d=new Demo();
		d.start();
		Thread.sleep(1000);
		synchronized(d)
			{
		System.out.println("main thread calling wait method");//1
				d.wait();
		System.out.println("main method going to wait for the  notification");//5

			}
		System.out.println("main method got notification");//6
	
	System.out.println("sum\t"+d.total);//7
	}
}
class Demo extends Thread
{
	int total=0;
	
	public void run()
	{
		synchronized(this)
	{
	System.out.println("chaild got chance to execute prolem");//2
	for (int i=0;i<=10 ;i++ )
	{
		total+=i;
		//System.out.println("child is doing the operations");
	}
			System.out.println("chaild is trying to give notificstion"); //3

		this.notify();
		System.out.println("chaild is given  notificstion to main method"); //4
	}
	
}
}
