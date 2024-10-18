package Java8codes.methodreference.exe1;

public class TestClass {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface = Employee::validateEmployee;
        employeeInterface.isValid(new Employee());
    }
}
