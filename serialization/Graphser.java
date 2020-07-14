import java.io.*;
class Graphser
{
	public static void main(String[] args) throws Exception
	{
Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("gr.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Hello World!");
FileInputStream fis=new FileInputStream("gr.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
				System.out.println(d1.c.r.x);

}
}
class Dog implements Serializable
{
cat c=new cat();
}
class cat implements Serializable
{
rat r=new rat();
}
class rat  implements Serializable
{
	 int x=13;

}

