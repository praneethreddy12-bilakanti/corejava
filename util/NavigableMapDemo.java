import java.util.*;
class  NavigableMapDemo
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap();
		t.put(101,"praneeth");
		t.put(131,"reddy");
		t.put(104,"prannu");
		System.out.println(t.lowerKey(131));
		System.out.println(t.higherKey(104));
		System.out.println(t.floorKey(104));
		System.out.println(t.ceilingKey(131));
		System.out.println(t.hashCode());
		System.out.println(t.descendingMap());
	
		System.out.println("Hello World!");
	}
}
