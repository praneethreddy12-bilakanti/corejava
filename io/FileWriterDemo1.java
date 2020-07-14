import java.io.*;
class FileWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
 FileWriter  fw=new  FileWriter ("abc.txt",true);
fw.write(112);
fw.write('r');
fw.write("aneethreddy");
fw.flush();
fw.close();
System.out.println(fw);
FileReader fr=new FileReader("abc.txt");
int i=fr.read();
while(i!=-1)
		{
	System.out.print((char)i+" \t");
	i=fr.read();
		}
		System.out.println("Hello World!");
	}
}
