package abstraction;

public class Demo1 extends demo2{
    void methodOne(){
        System.out.println("concrete method");
    }

    @Override
    void secondMethod() {

    }
}
abstract class demo2{
    abstract void secondMethod();
    void methods(){
        System.out.println("abstract class allows both abstract and concrete methods: ");
    }
}
