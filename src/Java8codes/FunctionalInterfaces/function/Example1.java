package Java8codes.FunctionalInterfaces.function;

import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        Function<Integer,Integer> function = i->i*i;
        System.out.println(function.apply(100));
        System.out.println("*****************");
        Function<String,Integer> functionOne = String::length;
        System.out.println(functionOne.apply("Shrishail"));

    }
}
