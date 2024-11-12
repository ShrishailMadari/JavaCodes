package dailycode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenFromStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,9387,43,43,214,324,244,2,12);
        List<Integer> stream = list.stream().filter(x -> x % 2 == 0).toList();
        for (Integer i : stream){
            System.out.println(i);
        }
        System.out.println();
//        or
        list.stream().filter(num->num%2==0).forEach(System.out::println);
    }
}

