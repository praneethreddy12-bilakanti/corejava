class StringBufferDemo1
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());
		sb.append("praneethkumarreddy");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("r");
		System.out.println(sb);
sb.insert(1,"prane");
		System.out.println(sb);

		System.out.println("Hello World!");
	}
}
