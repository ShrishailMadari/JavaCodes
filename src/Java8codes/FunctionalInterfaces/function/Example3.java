package Java8codes.FunctionalInterfaces.function;

import java.util.function.Function;

public class Example3 {
    public static void main(String[] args) {
        Function<String,String> f1 = String::toLowerCase;
        Function<String,String> f2 = String::toUpperCase;
        System.out.println(f1.andThen(f2).apply("Shrishail"));
        System.out.println();
        System.out.println(f1.compose(f2).apply("Dharwad"));
    }
}
