package Java8codes.FunctionalInterfaces.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeExample{
    String name;
    double salary;

    public EmployeeExample(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class Example2 {
    public static void main(String[] args) {
        ArrayList<EmployeeExample> employeeExamples = new ArrayList<>();
        employeeExamples.add(new EmployeeExample("shri",1000.0));
        employeeExamples.add(new EmployeeExample("vinay",2000.0));
        employeeExamples.add(new EmployeeExample("shiva",3000.00));
        employeeExamples.add(new EmployeeExample("agi",4000.00));
        employeeExamples.add(new EmployeeExample("yoyo",5000.00));

        Predicate<EmployeeExample> predicate = x->x.salary>=1000 && x.name.length()%2==0;
        for (EmployeeExample example: employeeExamples){
            if (predicate.test(example)){
                System.out.println(example.name+":"+example.salary);
            }
        }
    }
}
