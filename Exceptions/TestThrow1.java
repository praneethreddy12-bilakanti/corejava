public class TestThrow1{  
   static void validate(int age){  
     if(age<18)  
	   {
      throw new ArithmeticException("not valid");
	   }
     else  
	   {
      System.out.println("welcome to vote");  
	  }
   }  
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }  
}  throw	                                                                                           throws
1)	Java throw keyword is used to explicitly throw an exception.	  Java throws keyword is used to declare an exception.
2)	Checked exception cannot be propagated using throw only.	     Checked exception can be propagated with throws.
3)	Throw is followed by an instance.	                                                   Throws is followed by class.
4)	Throw is used within the method.	                                                Throws is used with the method signature.
5)	You cannot throw multiple exceptions.                            	             can declare multiple exceptions e.g.
                                                                                                        public void method()throws IOException,SQLException.