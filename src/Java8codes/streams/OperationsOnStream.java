package Java8codes.streams;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private String city;
    private int age;
    private String gender;
    private String department;
    private String yearOfJoinig;
    private Double salary;

    public Employee(int id, String name, String city, int age, String gender, String department, String yearOfJoinig, Double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoinig = yearOfJoinig;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoinig='" + yearOfJoinig + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
public class OperationsOnStream {
    public static void main(String[] args) {
//        List of employee object
        List<Employee> employeeList = employeeList();
    }

    private static List<Employee> employeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        return employees;
    }


}
