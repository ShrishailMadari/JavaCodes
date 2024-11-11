package Java8codes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {
        System.out.println("stream initialization: ");
        //creation using collection object
        List<String> stringList = List.of("shri","mady","shyloo","sheree");
        Stream<String> stream = stringList.stream();

        //using array
        String[] names = {"fg","ngtf","nhbgvfcdx"};
        Stream<String> list = Arrays.stream(names);


        //from static method
        Stream<Integer> integerStream = Stream.of(122, 988, 87, 987);

        //generate pre defined method
        Stream<String> generate = Stream.generate(() -> "one");
        
        //Stream builder
        //follows builder design pattern
        Stream.Builder<Object> builder = Stream.builder();
        builder.add("njhb").add("nhbhnj");


    }

}
