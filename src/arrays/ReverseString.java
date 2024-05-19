package arrays;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reversing string :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the String: ");
        String string = scanner.next();
        String value = "";

        for (int i = string.length()-1; i>=0; i--){
            value = value+string.replace("olleh","hello");
        }
        System.out.println(value);

    }
}
