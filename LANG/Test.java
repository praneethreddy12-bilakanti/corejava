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
	@Override
	public int hashCode()
	{
		int x='p';
		return x;
	}@Override
	public String toString()
	{
		return "rollno:"+"\t"+rollno+"\t"+"name:"+"\t"+name+"\t"+"city:"+"\t"+city;
}
}
public class Test
{


	public static void main(String[] args) 
	{
	Student s=new Student(101,"praneethreddy","hyd");
	System.out.println(s.toString());
	System.out.println(s.hashCode());
		
		System.out.println("Hello World!");
	}
}
