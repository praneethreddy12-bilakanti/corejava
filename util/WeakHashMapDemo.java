import java.util.*;
class WeakHashMapDemo 
{
	public static void main(String[] args) throws Exception
	{
		 WeakHashMap w=new WeakHashMap();
		 Temp t=new Temp();
		 w.put(t,"praneeth");
		 System.out.println(w);
		 
		t=null;
		 System.out.println(w);

		System.gc();
		 Thread.sleep(5000);
		 System.out.println(w);
}
}
class Temp
{
	
	public String toString()
	{
	return "temp";
	}
	public void finalize()
	{
		System.out.println("finalized method cled");
	}
}