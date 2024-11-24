package dailycode;

import java.util.ArrayList;
import java.util.List;

class Employee1011{
    private int id;
    private String name;
    private double salary;

    public Employee1011(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1011{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}

public class InterviceCode {
    public static void main(String[] args) {
        List<Employee1011> employeeList = new ArrayList<>();
        List<Employee1011> newEmp= employeeList.stream().filter(employee1011 -> employee1011.getSalary()<20000).toList();
        System.out.println(newEmp);
        }
}
