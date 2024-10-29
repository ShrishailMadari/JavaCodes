package Java8codes.FunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class DemoOFPredicate {
    public static void main(String[] args) {
        //verifying the age greater than 18
        Predicate<Integer> ageCheck = age->age>18;
        Boolean bol = ageCheck.test(10);
        System.out.println(bol);
        System.out.println(ageCheck.test(30));
        System.out.println(ageCheck.test(20));
    }
}
