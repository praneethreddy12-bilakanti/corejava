class Hashcode 
{
	public int hashCode()
	{
		return 10;
	}
	public static void main(String[] args) 
	{
		Hashcode h=new Hashcode();
		Hashcode h1=new Hashcode();
		//System.out.println(h);

	System.out.println(h.hashCode());

System.out.println(h);
System.out.println("to string method"+ h.toString());
		System.out.println("Hello World!");
		System.out.println(h.equals(h1));
	}
}
