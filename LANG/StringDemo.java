class  StringDemo
{
	public static void main(String[] args) 
	{
		char ch[]={'a','b','c','d','e'};
		String s2=new String(ch,1,3);
		System.out.println(s2);
		String s=new String("praneeth");
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	String s1="reddy";
	System.out.println(s+s1);
	System.out.println(s.concat(s1));
	System.out.println(s.length());
	System.out.println(s.isEmpty());
	System.out.println(s.charAt(1));
	System.out.println(s.compareTo(s1));
	System.out.println(s.contains("pr"));
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.endsWith("th"));
	byte[] b=s.getBytes();
	for(int i=0;i<b.length;i++)
		{
		System.out.println(b[i]);
		}


		System.out.println("Hello World!");
	
	System.out.println(s.trim());
	System.out.println(s1.replace("reddy","chandrika"));
	System.out.println(s1);
	}
}
