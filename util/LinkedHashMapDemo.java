import java.util.*;
class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap   lhm=new LinkedHashMap();


		lhm.put(100,"p");
		lhm.put(102,"r");
		lhm.put(103,"a");
		lhm.put(105,"n");
		lhm.put(104,"e");

		System.out.println(lhm);
Set s1=lhm.keySet();
System.out.println(s1);
Collection c=lhm.values();
System.out.println(c);
Set s2=lhm.entrySet();
System.out.println(s2);
Iterator itr=s2.iterator();
while(itr.hasNext())
		{
	Map.Entry m=(Map.Entry)itr.next();
	System.out.println(m.getKey()+"....................."+m.getValue());
	if(m.getKey().equals(103))
			{
		m.setValue("praneeth");
			}
		}

		System.out.println(lhm);
		System.out.println("Hello World!");
	}
}
