class Oper2 
{
	public static void main(String[] args) 
	{
		int a=10;
	//final int x=40;
   //x=41;

		//System.out.println("x value"+x);//error
		System.out.println("a value"+a);
		int y=(a++);
		System.out.println("y value"+y);
		System.out.println("y value"+y);
		System.out.println("a value post decrement"+(a--));
		System.out.println("a value"+a);
		System.out.println("a value pre decrement"+(--a));
	}
}
