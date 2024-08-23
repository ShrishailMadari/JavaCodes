package constructor.thisKeyword;

public class Child extends Parent{
    private int age = 20;
    private String name = "shri";

    Child(int age, String name) {
        super(10,"jihu");
        this.age = age;
        this.name = name;
        System.out.println(age+","+name);
    }

    void child(){
        System.out.println("child Class");
        System.out.println(super.age);
        System.out.println(super.age);
    }


    public static void main(String[] args) {
        Child child = new  Child(10000,"lalit");
    }


}
