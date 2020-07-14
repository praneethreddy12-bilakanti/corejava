import java.lang.reflect.*;
class DemoOnReflect 
{
	public static void main(String[] args) throws Exception 
	{
		Class c=Class.forName("java.lang.Object");
		Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1.getName());
		}

		System.out.println("Hello World!");
		System.out.println(c instanceof Object);
	
	}
}
