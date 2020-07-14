
import java.util.*;
class TreeMapDemo1
{
	public static void main(String[] args) 
	{
		MyComparator m=new MyComparator();
		TreeMap t=new TreeMap(m);
		t.put(101,"praneeth");
		t.put(131,"reddy");
		t.put(104,"prannu");
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		return I2.compareTo(I1);
}
}