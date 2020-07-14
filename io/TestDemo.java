class TestDemo  implements Cloneable
{ 
	int x=100;

	public static void main(String[] args) throws Exception
	{

TestDemo td=new TestDemo();
TestDemo td1=(TestDemo)td.clone();

		System.out.println(td.x);
		System.out.println(td1.x);
		td.x=200;
		System.out.println(td);
		System.out.println(td1);
		System.out.println(td.x);
		System.out.println(td1.x);
		System.out.println(td.hashCode());
		System.out.println(td1.hashCode());
		System.out.println("Hello World!");
	}
}
