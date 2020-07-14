import java.io.*;
class  Filedemo1 
{
	public static void main(String[] args) throws IOException
	{
		File f= new File("praneeth.txt");
		FileWriter  fw =new FileWriter(f);
		char[]  c={'p','r','a','n','e','e','t','h'};
		fw.write(c);
		fw.flush();

		System.out.println("Hello World!");
	}
}
