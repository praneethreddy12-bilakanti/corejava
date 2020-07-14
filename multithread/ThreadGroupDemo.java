class ThreadGroupDemo extends Thread
{
	public void run() 
		{  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) 
	   {  
      ThreadGroupDemo d=new ThreadGroupDemo();
	  ThreadGroup tg=new ThreadGroup("thread group");
	  Thread t1=new Thread(tg,d,"praneeth");
	  t1.start();
 Thread t2=new Thread(tg,d,"reddy");
	  t2.start();
	  System.out.println(tg.getName());
	  System.out.println(tg.activeCount());
	    tg.list();  }
}