public class TestGarbage1 
{
	   public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[])
	 {  

  TestGarbage1 tg=new TestGarbage1();
 

  tg=null;
  System.gc();  
 }  
}  