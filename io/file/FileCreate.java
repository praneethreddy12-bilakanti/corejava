import java.io.*;
class FileCreate
{
	public static void main(String[] args) throws IOException
	{
File f=new File("FileCreate.txt"); 
	System.out.println(f.exists());
f.createNewFile();
	System.out.println(f.exists());

}
}
