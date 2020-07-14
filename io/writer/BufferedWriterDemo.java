import java.io.*;
class BufferedWriterDemo 
{
	public static void main(String[] args) throws IOException
	{			FileWriter fw=new FileWriter("BufferedWriterDemo.txt");

		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("praneeth");
		bw.newLine();
		bw.write('r');
		bw.write(122);
		bw.flush();
		bw.close();
		System.err.println("error page");
		System.out.println("Hello World!");
		System.out.println("enter ascii");
		int i=System.in.read();//returns ASCII code of 1st character  
System.out.println(i);//will print the character  
	}
}
