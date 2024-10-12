package Java8codes.staticmethods.example1;

public class TestClass implements InterfaceOne{
    public static void main(String[] args) {
        System.out.println("static methods");

        //accessing the Static methods, not possible using class reference
        TestClass testClass = new TestClass();
        //calling the static methods using Class/interface Name since they belongs to the class or Interface level
        String  s = InterfaceOne.staticMethodOne();
        System.out.println(s);


    }
//accessing the static methods inside the class level methods
    @Override
    public String happyDashera() {
        InterfaceOne.staticMethodOne();
        return "happpy dasara :)";
    }
}
