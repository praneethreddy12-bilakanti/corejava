import  java.io.Serializable;
class Test implements Serializable
{
	 int x=20;
	int y=30;
	}
class SerializableDemo 
{
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(t);

		FileInputStream fis =new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Test t2=(Test)ois.readObject();
		System.out.println(t2.x+"\t"+t2.y);
	}

}
