class ThreadDemo extends Thread 
{
	/*public void run()
	{
		  System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    } */   
}

	class ThreadDemo5
	{
	
	public static void main(String[] args) 
	{
		ThreadDemo d=new ThreadDemo();
		
	System.out.println(d.getName());
	d.setName("praneeth");
	System.out.println(d.getName());
	System.out.println(d.isAlive());
	d.setPriority(Thread.MAX_PRIORITY);
	System.out.println(d.getPriority());
System.out.println(d.getId());
	System.out.println(Thread.currentThread());//d
	System.out.println(d.isDaemon());
d.start();
		System.out.println("Hello World!");
		d.stop();
		System.out.println(d.getName());
	}
}
