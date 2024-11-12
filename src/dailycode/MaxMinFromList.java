package dailycode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaxMinFromList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,987,765,45788);
        IntStream intStream = integerList.stream().mapToInt(Integer::intValue);//it will convert the no primitive into primitive type
        int asMax = intStream.max().getAsInt();
        System.out.println(asMax);
        int asMin = integerList.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(asMin);
    }
}
