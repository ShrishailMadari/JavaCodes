package Java8codes.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class FunctionAndPredicate {

    public static void main(String[] args) {
        // Step 1: Initialize a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 5000));
        employees.add(new Employee("Bob", 45, 7000));
        employees.add(new Employee("Charlie", 28, 3000));
        employees.add(new Employee("Diana", 35, 6000));
        employees.add(new Employee("Eve", 50, 10000));

        // Step 2: Create Predicates for filtering employees
        Predicate<Employee> p1 = employee -> employee.getAge()>40;
        Predicate<Employee> p2 = employee -> employee.getSalary()>1000;
        Predicate<Employee> complexFilter = p1.and(p2);

        Function<Employee,Employee> f1 = e->new Employee(e.getName(),e.getAge(),e.getSalary() *1.10);
        Function<Employee,Employee> f2 = e->new Employee(e.getName().toUpperCase(),e.getAge(),e.getSalary());

        Function<Employee,Employee> combined = f1.andThen(f2);

       List<Employee> list =  employees.stream().filter(complexFilter).map(combined).toList();

        System.out.println("Filtered and Transformed Employees:");
        for (Employee employee:list) {
            System.out.println(employee);
        }
    }
}
