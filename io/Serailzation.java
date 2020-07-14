import java.io.*;
class Test  implements Serializable 
{
	transient int x=12;
	transient int y=22;
	
	//	System.out.println("Hello World!");
	}

class Serailzation
{
	public static void main(String[] args)throws Exception
	{
	FileOutputStream fos =new FileOutputStream("abc.scr");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Test t=new Test();
	oos.writeObject(t);
	
	FileInputStream fis = new  FileInputStream("abc.scr");
		ObjectInputStream ois = new ObjectInputStream(fis);
Test t1=(Test)ois.readObject();
System.out.println(t.x+"\t"+t.y);
System.out.println(t1.x+"\t"+t1.y);

}
}