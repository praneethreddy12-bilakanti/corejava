import java.io.*;
class MultiSer 
{
	public static void main(String[] args) throws Exception
	{
		Dog d=new Dog();
		cat c=new cat();
		rat r=new rat();
FileOutputStream fos=new FileOutputStream("mult.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);
		FileInputStream fis=new FileInputStream("mult.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		cat c1=(cat)ois.readObject();
		rat r1=(rat)ois.readObject();

		System.out.println("Hello World!");
		System.out.println(d1.x);
		System.out.println(c1.x);
		System.out.println(r1.x);
		}
}
class Dog implements Serializable
{
	int x=13;
}
class cat implements Serializable
{
		int x=13;

}
class rat  implements Serializable
{
		int x=13;

}
