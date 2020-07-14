
import java.util.*;
class  SortedSetDemo
{
	public static void main(String[] args) 
	{
		SortedSet t=new TreeSet();
		t.add("p");
		t.add("r");
		t.add("a");
		t.add("n");
		t.add("e");
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet("p"));

			Iterator  itr=t.iterator();
				System.out.println("iterating objects::::::::::");
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				
				}
	}
}
