package Java8codes.lambdaexpressions.example2;
@java.lang.FunctionalInterface
public interface CalciiOperations {
    double operation(double a, double b);

    default void printInfo(){
        System.out.println("this is default method :)");
    }
    static void getTheShapeOfThings(){
        System.out.println("this is triangle");
    }
}
