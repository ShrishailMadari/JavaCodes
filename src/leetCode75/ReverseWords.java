package leetCode75;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("reversing words of string: ");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the words: ");
        String string = obj.nextLine();
        String s[] = string.split(" ");
        for (int i = s.length-1; i>=0; i++){
            System.out.println(s[i]+" ");
        }
    }
}
