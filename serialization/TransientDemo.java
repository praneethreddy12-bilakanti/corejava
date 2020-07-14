import java.io.*;
class Test implements Serializable
{
	 String name="praneeth";
	transient int x=40;
	int y=50;
}
class TransientDemo
{
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		FileOutputStream fos=new FileOutputStream("xyz.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.writeInt(124);
		FileInputStream fis=new FileInputStream("xyz.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test t1=(Test)ois.readObject();
		System.out.println("Hello World!");
		System.out.println(ois.readInt());
		System.out.println(t1.x+"\t"+t1.y+"\t"+t1.name);
	}
}
