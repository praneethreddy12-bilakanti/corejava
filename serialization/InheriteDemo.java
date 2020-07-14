import java.io.*;
class InheriteDemo 
{
	public static void main(String[] args) throws IOException,ClassNotFoundException 
	{
		Child c=new Child();
		FileOutputStream fos=new FileOutputStream("int.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		FileInputStream fis=new FileInputStream("int.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child d1=(Child)ois.readObject();
System.out.println(d1.x+"\t"+d1.y);
	}
}
class Parent implements Serializable
{
	int x=2;
}
class Child extends Parent
{
	int y=8;
}
