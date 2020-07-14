import java.io.*;
class BufferedOutputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		             FileOutputStream fout=new FileOutputStream("fos.txt");  

		BufferedOutputStream bos=new BufferedOutputStream(fout);
		bos.write('\u1233');
		String s="praneeth";
		byte[] bs=s.getBytes();
		bos.write(bs);
		bos.write('p');
		bos.write('r');
		bos.write('a');
		bos.write('n');
		bos.write('e');
		bos.write('e');
		bos.write('t');
		bos.write('h');
		bos.write('r');
		bos.write('e');
		bos.write('d');
		bos.write('d');
		bos.write('y');
		bos.flush();

bos.close();
		System.out.println();
		System.out.println(bos);
		FileInputStream fis=new FileInputStream("fos.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=bis.read();
		while(i!=-1)
		{
		System.out.print((char)i);
	i=bis.read();
		}
		bis.close();
		}
}
