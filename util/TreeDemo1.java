import java.util.*;
class TreeDemo1 
{
	public static void main(String[] args) 
	{      
		MyComparator m=new MyComparator();
		
		TreeSet<Integer> t=new TreeSet<Integer>(m );
		t.add(10);
		t.add(0);
		t.add(30);
		t.add(20);
		t.add(60);
		t.add(100);
		t.add(10);
		t.add(50);
		t.add(40);
		
		
		
		System.out.println(t);
		System.out.println("Hello World!");
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
	return  -I1.compareTo(I2);
	
		
		
		
		
		
		/*if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else 
			return 0;

//return -1;	
	//return +1;	
*/}
}