package leetCode75;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("reversing string using various method:");
        Scanner string = new Scanner(System.in);
        System.out.println("1). using charAt() method:-");
        System.out.println("enter the String you want to reverse: ");
        String stringObject = string.nextLine();
        System.out.println("Entered String Object is: "+stringObject);
        System.out.println("reversed String: "+reverseString(stringObject));

    }
    private static String reverseString(String string){
        String reversedObject = "";
        for(int i = string.length()-1; i>=0; i--){
            reversedObject = reversedObject+string.charAt(i);
        }
        return reversedObject;
    }
}
