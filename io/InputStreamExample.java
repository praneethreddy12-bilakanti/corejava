import java.io.*;  
class InputStreamExample {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("abc.txt");    
   FileInputStream input2=new FileInputStream("testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j=inst.read();   
   while(j!=-1)
	   {    
    System.out.print((char)j);   
	j=inst.read();   
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    