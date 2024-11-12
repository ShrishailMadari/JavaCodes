package dailycode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringUpperLowerCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Alice",
                "Bob",
                "Charlie",
                "David",
                "Eve",
                "Frank",
                "Grace",
                "Hannah",
                "Ivy",
                "Jack"
        );
        Stream<String> stream = names.stream();
        List<String> upperCase = stream.map(String::toUpperCase).toList();
        System.out.println(upperCase);

        List<String> lowerCase = names.stream().map(String::toLowerCase).toList();
        System.out.println(lowerCase);

    }
}
