package Java8codes.lambdaexpressions.example1;

public class TestClass implements InterfaceOne {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.calculate();
        t.methodOne();
        InterfaceOne one = () -> {
            System.out.println("this calculating the numbers");
        };
        //calling the abstract methods
        one.methodOne();
    }

    @Override
    public void calculate() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    @Override
    public String methodOne() {
        InterfaceOne.super.methodOne();
        return null;
    }
}
