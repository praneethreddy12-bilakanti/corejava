import java.util.*;
public class Testp {
public static void main(String[] args) {
System.out.println("Welcome to KG REDDY Engineering College");
System.out.println("--------Prime Number--------");
Scanner sc = new Scanner(System.in);
System.out.println("Enter valid Number");
int n = sc.nextInt();
//int c = 0;
for (int i = 1; i <= n; i++) {
if (n % i == 0) {
//c++;
}


System.out.println(n + "is Prime Number");
} else {
System.out.println(n + "is not Prime Number");
}
}
}