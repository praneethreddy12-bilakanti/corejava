import java.util.*;
class IdnetityHashMapDemo
{
	public static void main(String[] args) 
	{
		IdentityHashMap h=new IdentityHashMap();
	
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		System.out.println(I1==I2);
		System.out.println(I1.equals(I2));

		h.put(I2,"praneeth");
		h.put(I1,"praneethREDDY");

		System.out.println(h);
		System.out.println("Hello World!");
	}
}
