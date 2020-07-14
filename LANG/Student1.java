class Student1 
{
String name;
int rollno;
Student1(String name,int rollno)
	{
	this.name=name;
	this.rollno=rollno;
	}

public String toString()
	{
	return "praneeth";
	}

	public static void main(String[] args) 
	{
		Student1 s=new  Student1("praneeth",101);
		Student1 s1=new  Student1("praneeth",101);
		Student1 s2=new  Student1("ngaesh",131);
System.out.println(s);
System.out.println(s==s1);
System.out.println(s.equals(s2));
System.out.println(s.equals(s1));
System.out.println(s.hashCode());
System.out.println(s.toString());
	
	Integer i=new Integer(10);
System.out.println(i);
String q=new String("praneeth");
System.out.println(q);
		System.out.println("Hello World!");
	
}
}