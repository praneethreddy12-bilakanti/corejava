class ThreadJoinDemo extends Thread
{
	public void run()
	{
		for (int i=0;i<10 ;i++ )
		{
System.out.println("child thread");
		}
}

	public static void main(String[] args) throws Exception
	{
		ThreadJoinDemo d=new ThreadJoinDemo();
		
		/*ThreadJoinDemo d1=new ThreadJoinDemo();
		ThreadJoinDemo d2=new ThreadJoinDemo();
		*/d.start();
		
		//d.join(1000);
		/*d1.start();
		d1.setName("praneeth");
		//d2.start();
	
		/*
		System.out.println(d1.currentThread().getPriority());
		d1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("MIN"+d1.currentThread().getPriority());
	 System.out.println("Name of t1:"+d1.getName());  
  System.out.println("Name of t2:"+d2.getName());  
  System.out.println("id of t1:"+d1.getId());
  */

  for (int i=0;i<=10 ;i++ )
  {
	  System.out.println("main thread");
  }//d1.setDaemon(true);
//System.out.println(Thread.currentThread().isDaemon());
d.join();
}
}
