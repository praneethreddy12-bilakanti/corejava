class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb.capacity());
		System.out.println(sb.append("praneeth"));
		System.out.println("Hello World!");
		System.out.println(sb.length());
		//System.out.println(sb.reverse());
		System.out.println(sb.delete(0,5));
		System.out.println(sb.length());
		System.out.println(sb.insert(8,"reddy"));
	}
}
