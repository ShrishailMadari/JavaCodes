package Java8codes.lambdaexpressions.example1;
@FunctionalInterface
public interface InterfaceOne {
    void calculate();

    default String methodOne(){
        return "hello";
    }
    static void methodTwo(){
        System.out.println("this is static method");
    }
}
