import java.util.*;
class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet hs=new LinkedHashSet(12);
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
