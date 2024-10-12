package Java8codes.defaultmethods.usecase3;

public interface InterfaceTwo {
    default boolean checkNumber(){
        return true;
    }
    default String abc(){
        return "abc of interface two";
    }
}
