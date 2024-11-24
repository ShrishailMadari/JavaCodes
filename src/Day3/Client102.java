package Day3;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client102 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("from 100 to 200");
        IntStream.range(0,5).map(i->100+random.nextInt(100)).forEach(System.out::println);
        System.out.println();
        generateRandomNumbers();
    }

    private static void generateRandomNumbers() {
        Random random = new Random();
        IntStream ints = random.ints(5, 100, 200);
        Stream<Integer> boxed = ints.boxed();
        System.out.println(boxed.toList());
    }

}
