package Java8codes.staticmethods.example2;

public interface InterfaceOne {
    String checkNumber();
    static String getColors(){
        return "red color";
    }
    default String getSpecificAge(){
        return "123";
    }
}
