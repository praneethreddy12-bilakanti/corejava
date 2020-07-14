class MultiTasking

{
	public static void main(String[] args) 
	{
		Runnable r=new Runnable()
		{
			public void run()
			{
				System.out.println("parent ");
			}
		};
		Runnable r2=new Runnable()
		{
			public void run()
			{
				System.out.println("chaild");
			}
		};
		Thread t=new Thread(r);
		Thread t1=new Thread(r2);
		t.start();
		t1.start();
		System.out.println("Hello World!");
	}
}
