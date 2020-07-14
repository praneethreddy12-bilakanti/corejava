import java.io.*;
class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fis=new FileOutputStream("f:\\programes\\io\\praneeth.txt");
		BufferedOutputStream bos=new BufferedOutputStream (fis);
		String s="praneeth";
		byte[] b={65,98,95,95,36};
		byte[] b1=s.getBytes();
		fis.write(65);
		fis.write(65);
		fis.write(65);
		fis.write(b1);
		fis.write(b);
		fis.write('a');
		fis.flush();
		fis.close();
		System.out.println("Hello World!");
		
	}
}
