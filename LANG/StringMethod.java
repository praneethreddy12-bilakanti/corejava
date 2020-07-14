class  StringMethod
{
	public static void main(String[] args) 
	{
		String s="praneeth";
				System.out.println(s.trim());
			System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());


		System.out.println(s.length());
				System.out.println(s.charAt(1));
						System.out.println(s.substring(0,4));
								System.out.println(s.isEmpty());

		System.out.println(s.replace('p','c'));

		System.out.println(s.replaceAll("praneeth","chandrika"));
		System.out.println(s.valueOf(5));
				System.out.println(s.split("pran",3));


		System.out.println("Hello World!");
	}
}
