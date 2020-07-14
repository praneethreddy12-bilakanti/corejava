import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
				al.add("praneeth");
				System.out.println(al);//[praneeth]
				al.add(10);
				System.out.println(al);
				al.add(new Integer(10));
				System.out.println(al);
				al.add(null);
				System.out.println(al);//[praneeth,10,10,null]
				Iterator  itr=al.iterator();
				System.out.println("iterating objects::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				
				}

	}
}
