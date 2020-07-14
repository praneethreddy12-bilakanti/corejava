import java.io.*;  
public class FileOutputStreamExample {  
    public static void main(String args[])throws IOException
		{     
             FileOutputStream fout=new FileOutputStream("testout.txt");  
			 fout.write('a');
		byte[] b1={65,66,67,68,69,7,71,72,76,74};
		fout.write(b1);
			
			System.out.println(fout);
		fout.close();
		FileInputStream fis=new FileInputStream("testout.txt");
		byte[] b=new byte[3];
		int i=fis.read(b);
		while(i!=-1)
			{
		System.out.println((char)i);
		i=fis.read();
		}
}  
}