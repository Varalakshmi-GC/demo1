package day8;
import java.util.Scanner;

public class vvvv{


	    int a;
	    int b;

	    // Constructor
	    vvvv(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }

	    // Method
	    void display() {
	        System.out.println("First number: " + this.a);
	        System.out.println("Second number: " + this.b);
	        System.out.println("Sum: " + (this.a + this.b));
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int x = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int y = sc.nextInt();

	        // Calling constructor
	        vvvv obj = new vvvv(x, y);

	        // Calling method
	        obj.display();

	        sc.close();
	    }
	}
