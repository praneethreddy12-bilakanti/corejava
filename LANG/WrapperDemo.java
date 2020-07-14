class WrapperDemo 
{
	public void display()
		{
	System.out.println("clone");
		}
	public static void main(String[] args)  throws CloneNotSupportedException
	{
		Integer i=new Integer(10);//one constructor
		System.out.println(i);
		Integer i2=new Integer("10");//2 con
System.out.println(i2.toString());
Integer i3=Integer.valueOf("20");//xxxvalueOf method string
System.out.println(i3);
System.out.println(i3.floatValue());
		System.out.println("Hello World!");
Float f=new Float(12.5);
System.out.println(f);
Float f1=new Float("12.5");
System.out.println(f1);
Float f2=new Float(12.5f);
System.out.println(f2);
Float f3=Float.valueOf("12.5");
System.out.println(f3);
String s="30";
Float f4=Float.valueOf(s);
System.out.println(f4);
Boolean b =new Boolean(true);
System.out.println(b);
Boolean b1 =new Boolean(false);
System.out.println(b1);
Boolean b2=Boolean.valueOf(true);
System.out.println(f2.byteValue());
System.out.println(Integer.toHexString(100));
//parseXXX method
String s1="20020";
System.out.println(Integer.parseInt(s1));
System.out.println(Integer.parseInt("10110101",8));
//autoBoxing
int x=20;
System.out.println(x);
Integer z=x;
System.out.println(z);
int y=z;
System.out.println(y);

WrapperDemo w=new WrapperDemo();
//System.out.println(w instanceof Runtime);
WrapperDemo w1=(WrapperDemo)w.clone();
w.display();
w1.display();
	}
}
