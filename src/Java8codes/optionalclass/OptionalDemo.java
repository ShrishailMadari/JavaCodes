package Java8codes.optionalclass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

    }
    public static Optional<String> getName(){
        String name = null;
        if (name != null){
            Optional<String> value = Optional.of("Shrishail");
            return value;
        }
        Optional<String> value = Optional.of("Shrishail");
        return value;
    }
}
