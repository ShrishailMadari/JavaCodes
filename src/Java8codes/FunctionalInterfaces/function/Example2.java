package Java8codes.FunctionalInterfaces.function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Student[] student = {
                new Student("giri",47),
                new Student("rachi",94),
                new Student("rohit",50),
                new Student("rahul",64),
                new Student("padma",70),
                new Student("deepu",35),
                new Student("cat",30)
        };
        Function<Student,String> function = student1 -> {
            int marks = student1.marks;
            String grade = "";
            if(marks>=80)
                grade = "A";
            else if (marks>=60) 
                grade = "B";
            else if (marks>=50) {
                grade = "C";
            } else if (marks>=35) {
                grade ="D";
            }else
                grade = "Failed";
            return grade;
        };
        Predicate<Student> predicate = student1 -> student1.marks>60;

        for (Student s : student){
            System.out.println("Name: "+s.name);
            System.out.println("Marks: "+s.marks);
            System.out.println("Grade: "+function.apply(s));
            System.out.println();
        }
        System.out.println("*********************");
        for (Student s : student){
            if(predicate.test(s)){
                System.out.println("Name: "+s.name);
                System.out.println("Marks: "+s.marks);
                System.out.println(predicate.test(s));
            }
        }
    }
}
