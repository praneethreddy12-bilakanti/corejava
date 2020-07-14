import java.util.*;
class  ScannerDemo
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the first  number.......................................");
		int no1=sn.nextInt();
		System.out.println("enter age.....................");
		int no2=sn.nextInt();
		System.out.println("name is"+"\t"+no1+"\n"+"age"+"\t"+no2);
		int sum=0;
		sum=no1+no2;

		System.out.println("sum is"+sum);
		System.out.println("Hello World!");
	}
}
