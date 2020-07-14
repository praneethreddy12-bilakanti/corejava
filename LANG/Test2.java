class  Test2
{
	public static void main(String[] args) 
	{
		String s=new String("praneeth");

		System.out.println(s);
		System.out.println(s.hashCode());
		s.concat("reddy");
				System.out.println(s);
		String s1=s+"reddy";
				System.out.println(s1.hashCode());
		String s2="praneethreddy";
				System.out.println(s2);
				System.out.println(s1==s2);
System.out.println(s.length());
	System.out.println(s.isEmpty());
	System.out.println(s.charAt(1));
	System.out.println(s.compareTo(s1));
	System.out.println(s.contains("pr"));
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.endsWith("th"));
		System.out.println("Hello World!");
	}
}
