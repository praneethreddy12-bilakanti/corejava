import java.util.*;
import java.util.function.*;
class Employee
{
	String name;
	double exp;
	double sal;
	Employee(String name,double exp,double sal)
	{
		this.name=name;
		this.exp=exp;
		this.sal=sal;

	}
	public String toString()
	{

		return name+" "+exp+" "+sal;
	}
}

public class FunctionFinalProject 
{
	public static void main(String[] args) 
	{

	ArrayList <Employee>al=new ArrayList();
	al.add(new Employee("praneeth",2,1600));
	al.add(new Employee("sehwag",1,3400));
	al.add(new Employee("abd",2,2000));
	System.out.println(al);
	Function<Employee, Employee> f=e->
		{
		double sa;
		if(e.exp>1)
			{
			sa=e.sal+=400;
			}
	return sa;
		};
		for(Employee e1:al)
		{

			f.apply(e1);

	}
	System.out.println(al);
}
}