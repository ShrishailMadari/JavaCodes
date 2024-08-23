package constructor.thisKeyword;

public class Parent {
    int age = 50;
    String name = "shrishail";

    Parent(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age+","+name);
        System.out.println(this.age+","+this.name);

    }

    void parent(){
        System.out.println("parentClass");
    }
}
