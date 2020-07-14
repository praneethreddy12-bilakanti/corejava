class StringBuilderDemo 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.append("praneeth"));
		System.out.println(sb.insert(8,"reddy"));
		System.out.println(sb.subString(8,sb));
		System.out.println("Hello World!");
	
	}
}
