import java.io.*;
class FileWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("abc1.txt");
		fw.write(100);
		fw.write('\n');
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		String s="praneeth kumar reddy";
	
		fw.write('\n');
		
		fw.write(s);
		fw.flush();

fw.flush();
		System.out.println(fw);
		System.out.println("Hello World!");
	
	
	
	
	}
}
