class Runtimedemo 
{
	public static void main(String[] args) throws Exception
	{
	
		System.out.println(Runtime.getRuntime());
		System.out.println("Hello World!");
	System.out.println(Runtime.getRuntime().availableProcessors());
	System.out.println(Runtime.getRuntime());
	Runtime r=Runtime.getRuntime();
	System.out.println(r.freeMemory());
	System.out.println(r.totalMemory());
	System.out.println(Runtime.getRuntime().exec("shutdown -s -t 0"));
		}
}
