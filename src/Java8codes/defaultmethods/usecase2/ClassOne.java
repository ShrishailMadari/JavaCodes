package Java8codes.defaultmethods.usecase2;

public class ClassOne implements DefaultInterface {

    @Override
    public void printNames() {
        System.out.println("shrishail");
    }

    @Override
    public String getNames() {
        return "hello world";
    }
}
