package Java8codes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private int id;
    private String name;
    private String city;
    private int age;
    private String gender;
    private String department;
    private String yearOfJoinig;
    private Double salary;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYearOfJoinig() {
        return yearOfJoinig;
    }

    public void setYearOfJoinig(String yearOfJoinig) {
        this.yearOfJoinig = yearOfJoinig;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

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

        //get all employee names as list using traditional loop
        List<String> names = new ArrayList<>();
        for (Employee newEmployee: employeeList){
            names.add(newEmployee.getName());
        }
        System.out.println(names);
        Stream<Employee> stream = employeeList.stream();
        //list of Employee names
       List<String> employeesList2 =  stream.map(x->x.getName()).toList();
        System.out.println(employeesList2);

    }

    private static List<Employee> employeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"shri","city",44,"male","ECE","2012",8765456.987));
        employees.add(new Employee(101, "Shri", "CityA", 44, "Male", "ECE", "2012", 8765456.987));
        employees.add(new Employee(102, "Amit", "CityB", 35, "Male", "CSE", "2015", 7654345.00));
        employees.add(new Employee(103, "Sara", "CityC", 29, "Female", "EEE", "2018", 6543212.50));
        employees.add(new Employee(104, "Ravi", "CityD", 42, "Male", "MECH", "2010", 5432101.75));
        employees.add(new Employee(105, "Lily", "CityE", 33, "Female", "CIVIL", "2016", 4321098.25));
        employees.add(new Employee(106, "Mohan", "CityF", 48, "Male", "IT", "2008", 3210987.40));
        employees.add(new Employee(107, "Geeta", "CityG", 27, "Female", "CHEM", "2019", 2109876.60));
        employees.add(new Employee(108, "Vikram", "CityH", 39, "Male", "ECE", "2013", 1098765.80));
        employees.add(new Employee(109, "Nina", "CityI", 31, "Female", "EEE", "2017", 987654.90));
        employees.add(new Employee(110, "Rahul", "CityJ", 45, "Male", "MECH", "2011", 876543.20));
        return employees;
    }


}
