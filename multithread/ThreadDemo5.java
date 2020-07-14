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
	System.out.println(Thread.currentThread());
}
}