// 7. Find the employee with the highest salary from a list of employees.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}

public class JAVA_STREAMS_007 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 60000),
            new Employee("Bob", 75000),
            new Employee("Charlie", 55000),
            new Employee("Diana", 90000)
        );

        Optional<Employee> highestPaidEmployee = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaidEmployee.ifPresent(employee -> 
            System.out.println("Employee with highest salary: " + employee)
        );
    }
}
