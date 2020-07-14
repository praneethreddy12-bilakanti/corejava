import java.io.*;

public class FileToFile1
{
  public static void main(String args[])
  {
    try
    {  
      FileInputStream fis = new FileInputStream("abc.txt");
      FileOutputStream fos = new FileOutputStream(dis);
       DataInputStream dis=new DataInputStream(System.in);
	   dis.write("praneeth");
      int k;
      while( ( k = fis.read() ) != -1 )
      {
        fos.write(k);   		
        System.out.print( k);  
      }
      fos.close();
      fis.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File does not exist. " + e);
    }
    catch(IOException e)
    {
      System.out.println("Some I/O problem. " + e);
    }
   }
} 
