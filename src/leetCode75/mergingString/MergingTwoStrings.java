package leetCode75.mergingString;

import java.util.Scanner;

public class MergingTwoStrings {
    public static void main(String[] args) {
        System.out.println("merging two Strings");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two Strings: ");
        String string1 = obj.next();
        String string2 = obj.next();
        System.out.println(mergingStrings(string1, string2));
    }

    private static String mergingStrings(String firstWord, String secondWord){
        StringBuilder builder = new StringBuilder();
        int n1 = firstWord.length(); //abc
        int n2 = secondWord.length(); //def
        int i = 0;
        while (i<n1 || i<n2){
            if (i<n1){
                builder.append(firstWord.charAt(i));
            }
            if (i<n2){
                builder.append(secondWord.charAt(i));
            }
            i++;
        }
        return builder.toString();
    }
}
