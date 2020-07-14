//class ThreadDemo extends Thread
//{
//public void run()
	//{

//for (int k=0; k<10;k++ )
//{
	//System.out.println("run method :"+k);
//}
	//}

//}
// with anamouys style
class LambdaThread 
{
	public static void main(String[] args) 
	{
		for (int i=0; i<10; i++)
		{
			
		System.out.println("main method:"+i);	
		}
		Thread d=new Thread()
		{
public void run()
	{

for (int k=0; k<10;k++ )
{
	System.out.println("run method :"+k);
}
	}

		};
d.start();
	}
}
