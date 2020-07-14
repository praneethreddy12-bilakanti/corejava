//if an employee exp is greater the 1.5 years  and salary is less than 10000 then the salary will be increased by5000/- 
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

public class PredicateDemo7 
{
	public static void main(String[] args) 
	{
		ArrayList <Employee> al=new ArrayList();


al.add(new Employee("praneeth",1.5,10000));	
al.add(new Employee("vinod",2,10000));	
al.add(new Employee("bhanu",3.7,10000));	
al.add(new Employee("naresh",2,10000));	
al.add(new Employee("mahesh",1,10000));	
al.add(new Employee("nagesh",1,10000));	
Predicate<Employee> p=(emp)->emp.sal>1000 && emp.exp>1;
System.out.println(al);
	for(Employee e:al)
		{
		System.out.println("e...");
	if(p.test(e))
		{
				System.out.println("test..");

e.sal+=5000;
		}
		else
					System.out.println("fail.");

		}
				System.out.println(al);

}
}
