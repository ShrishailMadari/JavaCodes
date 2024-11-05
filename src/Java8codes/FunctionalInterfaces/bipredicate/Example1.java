package Java8codes.FunctionalInterfaces.bipredicate;

import java.util.function.BiPredicate;

public class Example1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (num1,num2)->(num1+num2)%2==0;
        biPredicate.test(100,200);
    }
}
