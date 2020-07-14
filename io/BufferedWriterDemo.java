import java.io.*;
class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		 FileWriter  fw=new  FileWriter ("abc.txt");

 BufferedWriter  bw=new  BufferedWriter (fw);
bw.write(112);
bw.newLine();
bw.write('r');
bw.newLine();
bw.write("aneethreddy");
bw.newLine();
bw.flush();
bw.close();
System.out.println(bw);
FileReader fr=new FileReader("abc.txt");

BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null)
		{
	System.out.println(line);
	line=br.readLine();
		}

	}
}
