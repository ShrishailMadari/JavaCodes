package dailycode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        // need to find the list of unique words from the list using java 8
        //1st I will create a string which has multiple words in it
        String str = "java is fun and java is powerful";

        // need to find the list of unique words from the sentence and store into the array
        String[] wordsArray = str.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        // Step 2: Create a stream from the array
        Stream<String> stream = Arrays.stream(wordsArray);
        //from stream find the distinct words
        List<String> list = stream.map(String::toLowerCase).distinct().toList();
        System.out.println(list);
    }
}
