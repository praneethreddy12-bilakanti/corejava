import java.util.*;
class ListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("p");
		al.add(10);
		al.add("praneeth");
		al.add(3,"pee1");
		al.add(2,"pr");
	System.out.println(al);
		al.set(0,"praneeth");
		System.out.println(al);
		System.out.println(al.indexOf("pr"));
		System.out.println(al.lastIndexOf("pr"));
		al.remove(0);
		
		System.out.println(al);
		System.out.println(al);



	}
}
