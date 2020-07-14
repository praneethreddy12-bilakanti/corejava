import java.util.*;
class LambdaSet 
{
	public static void main(String[] args) 
	{

		TreeSet<Integer> t=new TreeSet<>((s1,s2)->(s1>s2)?-1:(s1<s2)?1:0);
		t.add(2929);
		t.add(1111);
		t.add(0000);
		t.add(9999);
		t.add(1234455);
		t.add(686869);
		System.out.println(" set starting!"+t);
	}
}
