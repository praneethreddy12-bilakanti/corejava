import java.util.*;
class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("p");
		s.push("r");
		s.push("a");
		s.push("n");
		s.push("e");
		System.out.println(s);
		System.out.println("Hello World!");
	s.pop();
			System.out.println(s);
		System.out.println(s.search("r"));
		System.out.println(s.peek());

	}
}
