import java.io.*;
class  FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader f=new FileReader("FileWriterDemo.txt");
		int i=f.read();
		char[] ch=new char[100];
		int j=f.read(ch);
		System.out.println(ch);
			while(i!=-1)
				{
					System.out.println((char)i);
					i=f.read();
				}
		f.close();
	}
}
