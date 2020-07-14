import java.util.*;
class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.addElement("praneeth");
		v.addElement("prah");
		v.addElement("pradjgneeth");

		System.out.println(v);
		System.out.println(v.elementAt(2));
		System.out.println(v.elementAt(2));
		System.out.println(v.capacity());
		v.removeElement("prneeth");
		v.removeElementAt(0);
		System.out.println(v);

		System.out.println("Hello World!");
	}
}
