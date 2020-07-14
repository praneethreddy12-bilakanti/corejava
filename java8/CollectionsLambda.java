import java.util.*;
class CollectionsLambda 
{
	public static void main(String[] args) 
	{
ArrayList<Integer> al=new ArrayList<>();
	
al.add(10);
al.add(0);
al.add(15);
al.add(25);
al.add(5);

System.out.println(al);
Collections.sort(al,(a,b)->(a>b)?-1:(a<b)?1:0);
System.out.println(al);
}
}
