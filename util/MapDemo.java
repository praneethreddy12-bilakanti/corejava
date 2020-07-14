import java.util.*;
class  MapDemo
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(100,"praneeth");
		hm.put(101,"praneethreddy");
		hm.put(102,"praneethkumar");
		hm.put(103,"praneethreddy");
		hm.put(104,"praneethbilakanti");

		System.out.println("map"+hm);
Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
	Set s1=hm.entrySet();
			System.out.println(s1);
			Iterator itr=s1.iterator();
			while(itr.hasNext())
		{
Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		System.out.println(hm.remove(102));
		System.out.println(hm);




		System.out.println("Hello World!");
	}
}
