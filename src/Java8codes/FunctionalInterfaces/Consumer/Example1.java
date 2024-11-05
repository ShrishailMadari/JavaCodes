package Java8codes.FunctionalInterfaces.Consumer;

import java.util.function.Consumer;

class Movie{
     String name;
    Movie(String name){
        this.name = name;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Consumer<Movie> consumerOne = movie -> System.out.println(movie.name+": is releasing ");
        Consumer<Movie> consumerTwo = movie -> System.out.println(movie.name+": is flop");
        Consumer<Movie> consumerThree = movie -> System.out.println(movie.name+": is 😂😂 ");
        //consumer Chaining
        Consumer<Movie> consumer = consumerOne.andThen(consumerTwo).andThen(consumerThree);
        consumerOne.accept(new Movie("Shreee"));

        consumer.accept(new Movie("hey, how are you"));
    }
}
