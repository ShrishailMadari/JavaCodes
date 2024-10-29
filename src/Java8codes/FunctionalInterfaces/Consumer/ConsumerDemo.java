package Java8codes.FunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //list od names
        //have to print in uppercase

        List<String> names = List.of("xyz","abc","pqr","mno");
        Consumer<String> printToUpperCase = x-> System.out.println(x.toUpperCase());
        printToUpperCase.accept("shrishail");
        //we are converting the data to uppercase
        names.forEach(printToUpperCase);

        List<String> nameValues = new ArrayList<>();
        Consumer<String> list = str->nameValues.add(str.toUpperCase());
        names.forEach(list);
        System.out.println(nameValues);
    }
}
