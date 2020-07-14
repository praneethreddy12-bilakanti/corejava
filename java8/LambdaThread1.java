class LambdaThread 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<10; i++)
		{
			
		System.out.println("main method:"+i);	
		}
		Runnable  d=()->
		{
for (int k=0; k<10;k++ )
{
	System.out.println("run method :"+k);
}
	};
d.start();
	}
}
