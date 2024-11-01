package SolidPrinciples.srp.after;
// Class to represent student data
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
}

// Class to handle database operations for students
class StudentRepository {
    public void save(Student student) {
        // Code to save student to the database
        System.out.println("student saved in db");
    }

    public Student find(String id) {
        // Code to find and return a student by id
        return new Student("Sample Name", id); // Example return
    }
}

public class After {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        Student student = repository.find("12");
        System.out.println(student.getId()+" "+student.getName());
        repository.save(student);
    }
}
