package constructor;

public class Employee {
    int empId = 100;
    String empName = "shrishail";

    Employee(int empId,String empName){
        this.empId = empId;
        this.empName = empName;
    }
    void checkEmp(Boolean t){
        if(true){
            System.out.println("employee present");
        }
        else
            System.out.println("employee Absent");
    }
}
class TestingEmployee{
    public static void main(String[] args) {
    Employee employee = new Employee(102,"shri");
    employee.checkEmp(true);
        System.out.println(employee.empName);
    }
}
