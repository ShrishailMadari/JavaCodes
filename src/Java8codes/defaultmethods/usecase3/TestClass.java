package Java8codes.defaultmethods.usecase3;

public class TestClass implements InterfaceOne, InterfaceTwo {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.shape();
        System.out.println();
        testClass.checkNumber();
        System.out.println();
        String  s = testClass.abc();
        System.out.println(s);
    }

    @Override
    public String abc() {
         InterfaceOne.super.abc();
        return "this is overridden method of default method of interface one";
    }
}
