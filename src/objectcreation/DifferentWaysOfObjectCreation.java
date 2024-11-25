package objectcreation;
class Employee{
    private int id;
    private String name;
    private String Location;

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        Location = location;
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

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
public class DifferentWaysOfObjectCreation {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       /* using new key word*/
        Employee employee = new Employee(1,"jh","hgyf");
        System.out.println(employee);
        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getLocation());

        /*using instanceof(): this way of creating object is deprecated from java 9*/
        Object o = Class.forName("objectcreation.Employee").newInstance();
        System.out.println(o);
//       Class<> ew =  Employee.class.getNestHost();
//        System.out.println(ew);

    }
}
