package day6;
import java.util.Scanner;

class Employee {
    String name;
    int age;
    char designation;
    double salary;

    Employee(String name, int age, char designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}
public class EmployeeProgram {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Employee emp = null;
	        int choice;

	        do {
	            System.out.println("\n===== MENU =====");
	            System.out.println("1. Create");
	            System.out.println("2. Display");
	            System.out.println("3. Raise Salary");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	            case 1:
	                System.out.print("Enter name (exactly 2 spaces): ");
	                String name = sc.nextLine();

	                int spaces = 0;

	                for (int i = 0; i < name.length(); i++) {
	                    if (name.charAt(i) == ' ') {
	                        spaces++;
	                    }
	                }

	                if (spaces != 2) {
	                    System.out.println("Name must contain exactly 2 spaces.");
	                    break;
	                }

	                System.out.print("Enter age: ");
	                int age = sc.nextInt();

	                if (age <= 18 || age >= 60) {
	                    System.out.println("Age must be above 18 and below 60.");
	                    break;
	                }

	                System.out.print("Enter designation (P/M/T): ");
	                char designation = sc.next().toUpperCase().charAt(0);

	                double salary;

	                if (designation == 'P') {
	                    salary = 20000;
	                } 
	                else if (designation == 'M') {
	                    salary = 25000;
	                } 
	                else if (designation == 'T') {
	                    salary = 15000;
	                } 
	                else {
	                    System.out.println("Invalid designation.");
	                    break;
	                }

	                System.out.println("Do you want to create? (Yes/No)");
	                String answer = sc.next();

	                if (answer.equalsIgnoreCase("Yes")) {
	                    emp = new Employee(name, age, designation, salary);
	                    System.out.println("Employee created successfully.");
	                } else {
	                    System.out.println("Employee not created.");
	                }

	                break;

	            case 2:
	                if (emp == null) {
	                    System.out.println("No employee found.");
	                } else {
	                    System.out.println("\n===== EMPLOYEE DETAILS =====");
	                    System.out.println("Name        : " + emp.name);
	                    System.out.println("Age         : " + emp.age);
	                    System.out.println("Salary      : " + emp.salary);
	                    System.out.println("Designation : " + emp.designation);
	                }

	                break;

	            case 3:
	                if (emp == null) {
	                    System.out.println("No employee found.");
	                    break;
	                }

	                System.out.print("Enter name: ");
	                String searchName = sc.nextLine();

	                if (searchName.equalsIgnoreCase(emp.name)) {

	                    System.out.print("Enter raise percentage (1-10): ");
	                    double percentage = sc.nextDouble();

	                    if (percentage >= 1 && percentage <= 10) {

	                        emp.salary = emp.salary +
	                                (emp.salary * percentage / 100);

	                        System.out.println("Salary updated successfully.");

	                        System.out.println("\n===== UPDATED DETAILS =====");
	                        System.out.println("Name        : " + emp.name);
	                        System.out.println("Age         : " + emp.age);
	                        System.out.println("Salary      : " + emp.salary);
	                        System.out.println("Designation : " + emp.designation);

	                    } else {
	                        System.out.println("Percentage must be between 1 and 10.");
	                    }

	                } else {
	                    System.out.println("Name not found.");
	                }

	                break;

	            case 4:
	                System.out.println("Program exited.");
	                break;

	            default:
	                System.out.println("Invalid choice.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}

