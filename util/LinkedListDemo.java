import java.util.*;
class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
		al.add("p");
		al.add(10);
		al.add("praneeth");
		al.addFirst("pee1");
		al.addLast("pr");
	System.out.println(al);
		al.set(0,"praneeth");
		System.out.println(al);
		System.out.println(al.indexOf("pr"));
		System.out.println(al.lastIndexOf("pr"));
		al.removeLast();
		
		System.out.println(al);
		System.out.println(al);



	}
}
