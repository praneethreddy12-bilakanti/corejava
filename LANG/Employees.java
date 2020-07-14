class Employees implements Cloneable 
{
	private int eno;
	private String name;
	public Employees()
	{
		eno=102;
		name="praneeth";
	}
	public void display()
	{
		System.out.println(eno+"\t"+name);
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employees e=new Employees();
		e.display();
		System.out.println("Hello World!");
		Employees e2=(Employees)e.clone();
		System.out.println(e2);
		e2.display();
	}
}
