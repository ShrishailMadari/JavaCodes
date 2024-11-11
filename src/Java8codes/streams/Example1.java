package Java8codes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(133);
        arrayList.add(197);
        arrayList.add(108);
        arrayList.add(115);
        System.out.println(arrayList);
        System.out.println();
        Stream<Integer> stream = arrayList.stream();

        List<Integer> collect = stream.collect(Collectors.toList());
        System.out.println(collect);
    }
}
