package Java8codes.lambdaexpressions.example3;

public class TestClass {
    public static void main(String[] args) {
        InterfaceOne one = ()-> {
            System.out.println("this is abstract method");
        };
        one.multiply();
        String s = one.familyOfBrothers();
        System.out.println(s);
    }
}
