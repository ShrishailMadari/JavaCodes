package Java8codes.FunctionalInterfaces.function;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        //R apply(T t); abstract method
        Function<Integer,Double> halfValue = x -> x/2.0;
        Double value = halfValue.apply(100);
        System.out.println(value);

        Function<String,String> stringFunction = String::toUpperCase;
        String stringObj = stringFunction.apply("shrishail");
        System.out.println(stringObj);



    }
}
