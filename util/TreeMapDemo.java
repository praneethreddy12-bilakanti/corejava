
import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();
		t.put(101,"praneeth");
		t.put(131,"reddy");
		t.put(104,"prannu");

		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.headMap(131));
		System.out.println(t.tailMap(131));
		System.out.println(t.firstKey());
		System.out.println("Hello World!");
	Set s=	t.entrySet();
Iterator  itr=s.iterator();
				System.out.println("iterating objects::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
				while (itr.hasNext())
				{
	Map.Entry mp=(Map.Entry)itr.next();
					System.out.println(mp.getKey()+"\t"+mp.getValue());
				
				}
}
}
