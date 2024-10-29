package Java8codes.FunctionalInterfaces.Predicate;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String gender;

    public Employee(int id, String name, double salary,String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        Employee obj = (Employee) o;
       return this.getId()==obj.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, gender);
    }

    public Employee() {
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
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
