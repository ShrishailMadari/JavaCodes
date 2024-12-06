package methodchaining;
class Student{
    private int age;
    private String name;
    private String city;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Example {
    public static void main(String[] args) {
        Student student = new Student();
        //Before method chaining
        student.setAge(23);
        student.setCity("bangalore");
        student.setName("shri");
        System.out.println(student);
        System.out.println("*****************************************");

    }
}
