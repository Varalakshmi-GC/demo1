package day4;
import java.util.Scanner;
public class simplecalc {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);	
System.out.println("enter first number:");
int a=sc.nextInt();
System.out.println("enter second number:");
int b=sc.nextInt();
System.out.println("enter operator (+,-,*,/):");
char operator = sc.next().charAt(0);

if (operator == '+') {
    System.out.println("Result: " + (a + b));
} 
else if (operator == '-') {
    System.out.println("Result: " + (a - b));
} 
else if (operator == '*') {
    System.out.println("Result: " + (a * b));
} 
else if (operator == '/') {
    System.out.println("Result: " + (a / b));
} 
else {
    System.out.println("Invalid operator");
}

sc.close();
}
}

