import  java.io.*;
class FileExample 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("abc.txt");
        f.createNewFile();

		System.out.println(f.exists());
		 f.createNewFile();

		System.out.println(f.exists());
		System.out.println("Hello World!");
	}
}