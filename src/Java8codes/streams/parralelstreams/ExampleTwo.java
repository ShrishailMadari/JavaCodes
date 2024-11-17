package Java8codes.streams.parralelstreams;

import java.util.ArrayList;
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.addAll(List.of(100,200,300,400,500,600,700,800,900));

        integerArrayList.stream().parallel().map(num->num * 10).sequential().filter(num->num%2==0);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.stream().isParallel());

        System.out.println();

        integerArrayList.stream()
                .parallel()
                .map(num->num*2)
                .filter(n->n<100)
                .forEach(System.out::println);
        System.out.println(integerArrayList);
        System.out.println();

    }
}
