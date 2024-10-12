package Java8codes.defaultmethods.usecase3;

public interface InterfaceOne {

    default void shape(){
        System.out.println("find the shape");
    }
    default String abc(){
        return "abc of Interface one";
    }
}
