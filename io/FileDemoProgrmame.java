import java.io.*;
class FileDemoProgrmame
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("praneeth.txt");

		System.out.println(f.exists());
		            if (f.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  

	}
}
