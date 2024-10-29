package Java8codes.FunctionalInterfaces;

import java.util.function.Function;

public class ComposeMethod {
    public static void main(String[] args) {
        Function<String,String> functionOne = String::toUpperCase;
        String string = functionOne.apply("shrishail");
        System.out.println("this is without andThen "+string);
        System.out.println();

        Function<String,String> functionTow = str->str == null?"enter the valid String value":str;
        System.out.println(functionTow.apply("madari"));
        String valueOfAndThen = functionTow.andThen(functionOne).apply("shrishail");
        System.out.println(valueOfAndThen);
        String valueOfCompose = functionTow.compose(functionOne).apply("This is compose");
        System.out.println(valueOfCompose);

        Function<String,String> val = Function.identity();
        String str = val.apply("Shri");
        System.out.println(str);
    }
}
