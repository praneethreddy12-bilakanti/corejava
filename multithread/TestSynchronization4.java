class Table{  
   synchronized static void printTable(int n){ 
	 
   for(int i=1;i<=10;i++){  
     System.out.println(n*i);  
     try{  
       Thread.sleep(400);  
     }catch(Exception e){}  
   }  
 }  
}  
  
class MyThread1 extends Thread{  
	{
	  System.out.println("MyThread1");
  }

public void run(){  
		  System.out.println("run1");

Table.printTable(1);  
}  
}  
  
class MyThread2 extends Thread{  
	{
	  System.out.println("MyThread2");
  }

public void run(){  
		  System.out.println("run2");

Table.printTable(10);  
}  
}  
  
class MyThread3 extends Thread{  
	{
	  System.out.println("MyThread3");
  }

public void run(){  
		  System.out.println("run3");

Table.printTable(100);  
}  
}  
  
  
  
  
class MyThread4 extends Thread{  
	{
	  System.out.println("MyThread4");
  }

public void run(){  
		  System.out.println("run4");

Table.printTable(1000);  
}  
}  
  
public class TestSynchronization4{  
public static void main(String t[]){  
MyThread1 t1=new MyThread1();  
MyThread2 t2=new MyThread2();  
MyThread3 t3=new MyThread3();  
MyThread4 t4=new MyThread4();  
t1.start();  
t2.start();  
t3.start();  
t4.start();  
}  
}  