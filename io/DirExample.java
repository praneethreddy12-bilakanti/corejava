  import  java.io.*;
class DirExample 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("abc");
      
		System.out.println(f.exists());
		 f.mkdir();

		System.out.println(f.exists());
		System.out.println("Hello World!");
	}
}