import java.io.*;
class PrintDemo 
{
	public static void main(String[] args)throws IOException 
	{
	PrintStream ps=new PrintStream(System.out);
	ps.println(20);
		System.out.println("Hello World!");
	
	ps.println("praneeth");
		System.err.println("Hello World!");
		System.out.println("chandrika!");
int i=System.in.read();//returns ASCII code of 1st character  
System.out.println((char)i);//will print the character
}
}
