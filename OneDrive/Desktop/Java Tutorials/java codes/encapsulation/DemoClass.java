package encapsulation;

public class DemoClass {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.age);
        student.setAge(100);
        student.setName("Shri");
        System.out.println(student.getClass());
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
class Student
{
    public int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
