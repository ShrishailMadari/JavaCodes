package dailycode;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class GroupEmployeesByAge {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"shri","CSE",500000));
        employeeList.add(new Employee(2,"guru","ECE",500000));
        employeeList.add(new Employee(3,"muyu","ISE",500000));
        employeeList.add(new Employee(4,"yoyo","ESE",500000));
        employeeList.add(new Employee(5,"sexy","EEE",500000));
        employeeList.add(new Employee(6,"gandu","ITE",500000));
        employeeList.forEach(System.out::println);
        System.out.println();

        Stream<Employee> stream = employeeList.stream();
        Stream<String> stringStream = stream.map(Employee::getName);
        List<String> list = stringStream.toList();
        System.out.println(list);
    }
}
