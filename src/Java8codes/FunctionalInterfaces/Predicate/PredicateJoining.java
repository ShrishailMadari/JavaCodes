package Java8codes.FunctionalInterfaces.Predicate;

import java.util.function.Predicate;

class JoiningPredicate{
    Integer[] x = {10,20,30,7,9,4,8,33};
}
public class PredicateJoining {
    public static void main(String[] args) {
        JoiningPredicate joiningPredicate = new JoiningPredicate();
        Predicate<Integer> p1 = one->one%2==0;
        Predicate<Integer> p2 = two->two>=10;
        for (Integer i : joiningPredicate.x){
            System.out.println( p1.and(p2).test(i));
            System.out.println(i);
            System.out.println();
        }
        System.out.println("************************************");
        for (Integer i : joiningPredicate.x){
            System.out.println( p1.or(p2).test(i));
            System.out.println(i);
            System.out.println();
        }
        System.out.println("****************************************");
        for (Integer i : joiningPredicate.x){
            System.out.print(p1.test(i));//numbers which are even
            System.out.print(i+" ");
            System.out.println();
            System.out.print(p1.negate().test(i));//numbers which are not even
            System.out.print(i+" ");
            System.out.print(p2.test(i)); // numbers which are greater than 10
            System.out.print(i+" ");
            System.out.println();
            System.out.print(p2.negate().test(i)); // numbers which are not greater than 10
            System.out.print(i+" ");

        }

    }
}
