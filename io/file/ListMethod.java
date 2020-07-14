import java.io.*;
class  ListMethod
{
	public static void main(String[] args) 
	{int count=0;
		File f=new File("f:\\programes");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
			
		}
	System.out.println("total count:"+count);
	}
}
