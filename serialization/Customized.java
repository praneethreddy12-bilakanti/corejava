import java.io.*;
class Customized 
{
	public static void main(String[] args) throws Exception
	{Test t=new Test();
		FileOutputStream fos=new FileOutputStream("cus.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(t);
		FileInputStream fis=new FileInputStream("cus.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test t2=(Test)ois.readObject();
		System.out.println("Hello World!");
		System.out.println(t2.no+"\t"+t2.name);
	}
}class Test implements Serializable
{
int no=134;
transient String name="praneeth";
private void writeObject(ObjectOutputStream os)throws Exception
	{
os.defaultWriteObject();
String ename="123"+name;
os.writeObject(ename);

	}
	private void readObject(ObjectInputStream is)throws Exception
	{
is.defaultReadObject();
String ename=(String)is.readObject();
name=ename.substring(3);
	}

}
