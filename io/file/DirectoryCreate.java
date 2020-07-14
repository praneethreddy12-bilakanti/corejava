import java.io.*;
class DirectoryCreate
{
	public static void main(String[] args) throws IOException
	{

		File f=new File("DirectoryCreate");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		f.mkdir();
		System.out.println(f.isDirectory());
		System.out.println("Hello World!");
	}
}
