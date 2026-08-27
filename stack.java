package day7;

public class stack {
static void methodA() {
	System.out.println("Inside methodA");
    methodB();
    System.out.println("back to  methodA");
    }
static void methodB() {
	System.out.println("Inside methodB");
}
public static void main(String[]args) {
System.out.println("Inside main");
methodA();
System.out.println("back to  methodA");
}
}