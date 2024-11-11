package Java8codes.streams;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateStream {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "hello world";
            }
        };
//        generate will always generate the objects
         Stream<String> stringStream = Stream.generate(stringSupplier);
//        Consumer<String> consumer =
//         stringStream.forEach();
    }


}
