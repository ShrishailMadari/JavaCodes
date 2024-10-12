package Java8codes;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("this is for testing");

        ClassOne defaultMethods = new ClassOne();
        defaultMethods.getAllNames();
        System.out.println();
        defaultMethods.Vehicles();
        System.out.println();
       String name = defaultMethods.getNames();
        System.out.println(name);
        System.out.println("===================================================");
        ClassTwo two = new ClassTwo();
        two.getNames();
        two.getAllNames();
    }
}
