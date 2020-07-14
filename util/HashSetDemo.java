import java.util.*;
class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("p");
		hs.add("r");
		hs.add("a");
		hs.add("n");
		hs.add("e");
		hs.add("e");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("p"));

		System.out.println("Hello World!");
	}
}
