package Java8codes.FunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.setId(100);
        empOne.setName("Shrishail");
        empOne.setSalary(35000);
        empOne.setGender("male");

        Predicate<Employee> salaryCheck = emp->emp.getSalary()>2500;
        if (salaryCheck.test(empOne)) {
            System.out.println("salary is greater than 25K");
        }else System.out.println("salary below 25k");
        //and,or default methods
        Predicate<Employee> femaleCheck =e->e.getGender().equalsIgnoreCase("Female");
        boolean andCheck = salaryCheck.and(femaleCheck).test(empOne); // both condition has to be satisfied
        boolean orCheck = salaryCheck.and(femaleCheck).test(empOne); // any one condition has to be satisfied
        System.out.println(andCheck+" "+orCheck);

        //negate
        boolean negateCheck = femaleCheck.negate().test(empOne);
        System.out.println("this is the negate Check: " +negateCheck);
        System.out.println();

        // static method
        Predicate<Employee> baseEmployee = Predicate.isEqual(empOne);
        Employee newEmployee = new Employee();
        newEmployee.setGender("Male");
        newEmployee.setId(100);
        newEmployee.setName("Shrishail");
        newEmployee.setSalary(35000);
       boolean result = baseEmployee.test(newEmployee);
        System.out.println(result);


    }
}
