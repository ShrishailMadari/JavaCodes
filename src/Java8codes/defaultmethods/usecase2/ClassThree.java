package Java8codes.defaultmethods.usecase2;

public class ClassThree implements DefaultInterface {
    @Override
    public void printNames() {
        System.out.println("class three object");
    }

    @Override
    public String getNames() {
        return "class three object of abstract method";
    }

    @Override
    public void getAllNames() {
        System.out.println("this is overridden default method");
    }

    @Override
    public String Vehicles() {
        System.out.println("this is overridden method for default method");
        return "we can override the default methods";
    }
}
