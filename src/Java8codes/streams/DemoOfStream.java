package Java8codes.streams;

import java.util.stream.Stream;

//streams: to perform the operations on data
//streams Types: Java util Streams and Java io Streams
//Java util: on data,collection, arrays etc
// object of the stream can be created using the of() or stream() method
public class DemoOfStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,7,8);

    }
}
