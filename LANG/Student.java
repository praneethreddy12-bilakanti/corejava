class  Student
{
	private int rollno;
	private String name;
	private String city;
	public Student(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	public int hashCode(int rollno)
	{
		return this. rollno;
	}
}
public class Test
{


	public static void main(String[] args) 
	{
	Student s=new Student(101,"praneethreddy","hyd");
	System.out.println(s);
		
		System.out.println("Hello World!");
	}
}
