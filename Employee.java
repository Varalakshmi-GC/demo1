package day3;
import java.util.Scanner;

public class Employee {


	    // Instance variables
	    String name;
	    int age;
	    String designation;
	    double salary;

	    // Constructor
	    Employee(String name, int age, String designation, double salary) {
	        this.name = name;
	        this.age = age;
	        this.designation = designation;
	        this.salary = salary;
	    }

	    // Display method
	    void display() {
	        System.out.println("\n--- Employee Details ---");
	        System.out.println("Name        : " + name);
	        System.out.println("Age         : " + age);
	        System.out.println("Designation : " + designation);
	        System.out.println("Salary      : " + salary);
	    }

	    // Raise salary method
	    void raiseSalary(double amount) {
	        salary = salary + amount;
	        System.out.println("Salary raised successfully!");
	        System.out.println("New Salary  : " + salary);
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Employee emp = null;
	        int choice;

	        do {
	            System.out.println("\n===== EMPLOYEE MENU =====");
	            System.out.println("1. Create");
	            System.out.println("2. Display");
	            System.out.println("3. Raise Salary");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	            case 1:

	                sc.nextLine();

	                // Enter name
	                System.out.print("Enter Name: ");
	                String name = sc.nextLine();

	                // Enter age between 18 and 60
	                int age;

	                while (true) {
	                    System.out.print("Enter Age (18-60): ");
	                    age = sc.nextInt();

	                    if (age >= 18 && age <= 60) {
	                        break;
	                    }

	                    System.out.println("Invalid age! Enter age between 18 and 60.");
	                }

	                sc.nextLine();

	                // Yes or No
	                System.out.print("Do you want to continue? (yes/no): ");
	                String answer = sc.nextLine();

	                if (answer.equalsIgnoreCase("yes")) {

	                    // Designation
	                    System.out.println("\nEnter Designation:");
	                    System.out.println("P - Programmer");
	                    System.out.println("M - Manager");
	                    System.out.println("T - Tester");

	                    System.out.print("Enter designation: ");
	                    char d = sc.next().charAt(0);

	                    String designation;
	                    double salary;

	                    if (d == 'P' || d == 'p') {
	                        designation = "Programmer";
	                        salary = 20000;
	                    } 
	                    else if (d == 'M' || d == 'm') {
	                        designation = "Manager";
	                        salary = 25000;
	                    } 
	                    else if (d == 'T' || d == 't') {
	                        designation = "Tester";
	                        salary = 15000;
	                    } 
	                    else {
	                        System.out.println("Invalid designation!");
	                        break;
	                    }

	                    // Create object using constructor
	                    emp = new Employee(name, age, designation, salary);

	                    System.out.println("Employee created successfully!");

	                } 
	                else {
	                    System.out.println("Returning to main menu...");
	                }

	                break;

	            case 2:

	                if (emp != null) {
	                    emp.display();
	                } 
	                else {
	                    System.out.println("Please create employee first.");
	                }

	                break;

	            case 3:

	                if (emp != null) {

	                    System.out.print("Enter salary raise amount: ");
	                    double amount = sc.nextDouble();

	                    emp.raiseSalary(amount);

	                } 
	                else {
	                    System.out.println("Please create employee first.");
	                }

	                break;

	            case 4:

	                System.out.println("Program exited.");
	                break;

	            default:

	                System.out.println("Invalid choice!");

	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}

