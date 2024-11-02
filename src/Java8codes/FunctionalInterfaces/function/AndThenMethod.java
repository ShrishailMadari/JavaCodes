package Java8codes.FunctionalInterfaces.function;

import java.util.function.Function;

public class AndThenMethod {
    public static void main(String[] args) {
        Function<String, String> stringFunction = String::toUpperCase;

        //andThen(): after executing the main code then second
        Function<String, String> value = str->str == null? "Enter valid value": str;

        String converted = value.andThen(stringFunction).apply("shrishail");
        System.out.println(converted);

    }
}
