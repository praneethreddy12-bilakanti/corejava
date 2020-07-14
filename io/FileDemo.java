import java.io.*;
class FileDemo 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("praneeth.txt");
		FileReader fr =new FileReader(f);
		int i=0;
		while ((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		System.out.println("Hello World!");
	}
}
