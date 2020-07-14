import java.io.*;
class TryResource 
{
	public static void main(String[] args)throws IOException
	{
		try(FileWriter bf=new FileWriter("abc.txt"))
		{
			bf.write("praneeth");
			bf.flush();
		}
		
		System.out.println("Hello World!");
	}
}
