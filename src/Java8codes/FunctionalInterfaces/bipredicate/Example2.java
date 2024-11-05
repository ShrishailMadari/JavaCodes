package Java8codes.FunctionalInterfaces.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private int yearsAtCompany;

    public Employee(String name, double salary, int yearsAtCompany) {
        this.name = name;
        this.salary = salary;
        this.yearsAtCompany = yearsAtCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", yearsAtCompany=" + yearsAtCompany +
                '}';
    }
}
public class Example2 {
    public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 90000, 5));
        employeeList.add(new Employee("Bob", 120000, 7));
        employeeList.add(new Employee("Charlie", 75000, 3));
        employeeList.add(new Employee("Diana", 60000, 10));
        employeeList.add(new Employee("Eve", 150000, 4));

        BiPredicate<Double,Integer> biPredicate = (salary,yrs)->salary>4000 && yrs>5;
        List<Employee> list = employeeList.stream().filter(e->biPredicate.test(e.getSalary(), e.getYearsAtCompany())).toList();
        for (Employee employee : list){
            System.out.println(employee);
        }
    }
}
