package Java8codes.methodreference.exe1;

public class TestClass {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface = Employee::validateEmployee;
//        validating the employee
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("admin");
        boolean b = employeeInterface.isValid(employee);
        System.out.println(b);
    }
}
