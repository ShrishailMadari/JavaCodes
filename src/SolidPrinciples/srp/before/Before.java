package SolidPrinciples.srp.before;
class Student {
    private String name;
    private String id;

    // Constructor, getters, and setters
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }

    // Method that violates SRP
    public void saveToDatabase() {
        // Code to save student information to a database
    }
}

public class Before {
    public static void main(String[] args) {
        Student student = new Student("shri","101");
        System.out.println(student.getId());
        student.saveToDatabase();

    }
}
