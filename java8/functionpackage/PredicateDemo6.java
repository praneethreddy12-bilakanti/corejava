// verify the username and password is valid or not?
import java.util.function.*;
import java.util.*;
class User
{
 String uname;
 String password;
User(String uname,String password)
	{
	this.uname=uname;
	this.password=password;
}
}
public class PredicateDemo6 
{
	public static void main(String[] args) 
	{
		Predicate<User> p=u->u.uname.equals("praneeth")&&u.password.equals("spring");
Scanner sn=new Scanner(System.in);
System.out.println("enter username");
String name=sn.next();
System.out.println("enter password");
String pwd=sn.next();
User u=new User(name,pwd);
if(p.test(u))
		{
	System.out.println(" he is a valid user now you can learn spring");
		}
		else
		{
System.out.println("sorry! try again");
		}

	
	
	}
}
