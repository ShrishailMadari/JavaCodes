package Java8codes;

public class ClassTwo implements DefaultInterface{
    //accessing the default methods from class level methods
    @Override
    public void printNames() {
        String s = getNames();
        System.out.println(s);
    }

    @Override
    public String getNames() {
        getAllNames();
        return null;
    }
}
