package Java8codes.defaultmethods.usecase2;

public interface DefaultInterface {
    //abstract methods
    void printNames();
    String getNames();

    //default methods
    default void getAllNames(){
        System.out.println("hello java 8, this is default method");
    }

    default String Vehicles(){
        System.out.println("hello java 8, this is default method too");
        return "Bike";
    }
}
