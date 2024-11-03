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
        Consumer<Movie> consumer = movie -> System.out.println(movie.name+": is releasing ");
        consumer.accept(new Movie("Sexy Woman"));
    }
}
