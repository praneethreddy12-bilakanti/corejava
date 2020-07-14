
import java.io.*;
public class FileMetaData  
{
  public static void main(String args[ ] ) throws IOException
  {                                                          
    System.out.println("pathSeparatorChar = " + File.pathSeparatorChar);
    System.out.println("pathSeparatorChar = " + File.pathSeparator);
    
    File file1 = new File("pqr.txt");
    System.out.println("getName(): " + file1.getName());
    System.out.println("getAbsolutePath(): " + file1.getAbsolutePath()) ;
    System.out.println("canRead(): " + file1.canRead()) ;
    System.out.println("canWrite(): " + file1.canWrite()) ;
    System.out.println("isFile(): " + file1.isFile()) ;
    System.out.println("isDirectory: " + file1.isDirectory()) ;
    System.out.println("File last modified date: " + file1.lastModified());
    System.out.println("File size: " + file1.length() + " Bytes");      
    System.out.println("File exists(): " + file1.exists());
  }  
}