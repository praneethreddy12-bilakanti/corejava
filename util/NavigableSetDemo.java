
import java.util.*;
class  NavigableSetDemo
{
	public static void main(String[] args) 
	{
		NavigableSet t=new TreeSet();
		t.add(100);
		t.add(400);
		t.add(400);
		t.add(1500);
		t.add(200);
		t.add(3100);
		t.add(50);
		
		System.out.println(t);
		System.out.println(t.first());//50
		System.out.println(t.subSet(200,3100));
		System.out.println(t.headSet(1500));
		System.out.println(t.tailSet(1500));
		System.out.println(t.lower(1500));
		System.out.println(t.higher(1500));
		System.out.println(t.floor(1400));
		System.out.println(t.ceiling(1400));
		

	Iterator  itr=t.iterator();
				System.out.println("iterating objects:::::::::");
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				
				}	}
}
