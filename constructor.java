package day8;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Employee {

    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + department + " " + salary;
    }
}

public class constructor {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Ravi", "IT", 6000),
            new Employee("Anil", "HR", 5000),
            new Employee("priya", "IT", 5000),
            new Employee("Amit", "HR", 6000),
            new Employee("Rahul", "AT", 5000)
        );

        employees.sort(
            Comparator.comparing((Employee e) -> e.department)
                      .thenComparing(
                          (Employee e) -> e.salary,
                          Comparator.reverseOrder()
                      )
        );

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}