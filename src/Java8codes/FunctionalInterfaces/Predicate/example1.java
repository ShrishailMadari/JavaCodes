package Java8codes.FunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class example1 {
    public static void main(String[] args) {
        // to find the length of the single string using predicate
        Predicate<String> predicate = x->x.length()>5;
        System.out.println(predicate.test("Shrishail"));
        System.out.println();

        // to find the length of the array of string using predicate
        String[] names = {"vinay","Rachit","Pratyush","abhinav","rahul","naveen","Manjunath","Sidhart","shrishaila"};
        Predicate<String> stringPredicate = x->x.length()%2==0 && x.length()>7;
        for (String forEachString: names){
            if (stringPredicate.test(forEachString)){
                System.out.println(forEachString);
            }
        }


    }
}
