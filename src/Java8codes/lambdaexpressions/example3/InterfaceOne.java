package Java8codes.lambdaexpressions.example3;
@FunctionalInterface
public interface InterfaceOne extends interfaceTwo {
    //functional interface can extend other interface but other interface must hv no abstract method
    void multiply();
}
