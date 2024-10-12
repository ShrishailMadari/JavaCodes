package Java8codes.staticmethods.example2;

public class TestClass implements InterfaceOne,InterfaceTow{
    public static void main(String[] args) {
        System.out.println("this is static methods example");
        TestClass testClass = new TestClass();
        testClass.checkNumber();
        testClass.getSpecificAge();
    }

    @Override
    public String checkNumber() {
        String s = InterfaceTow.getColors();
        System.out.println(s);
        return s;
    }

    @Override
    public String getSpecificAge() {
        String s = InterfaceTow.getColors();
        System.out.println(s);
        return InterfaceOne.super.getSpecificAge();
    }
}
