package Java8codes.streams.parralelstreams;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.addAll(List.of(100,200,300,400,500,600,700,800,900));
        integerArrayList.stream().forEach(System.out::println);
        System.out.println(integerArrayList.stream().isParallel());

        System.out.println();

        integerArrayList.stream().parallel().map(n->n*10).filter(num->num<500).forEach(System.out::println);
        System.out.println(integerArrayList);

        //here stream is acting as the sequential
        System.out.println();
        //using parallel
        Stream<Integer> integerStream  = integerArrayList.stream().parallel();
        integerStream.forEach(System.out::println);
        System.out.println(integerStream.isParallel());
    }
}
