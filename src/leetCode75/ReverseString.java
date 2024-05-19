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
        System.out.println();
        System.out.println("2). using array: ");
        System.out.println("reversed String: "+reverseUsingCharArray(stringObject));
        System.out.println();
        System.out.println("3). using StringBuffer");
        System.out.println("reversed String: "+usingStringBuffer(stringObject));
    }
    private static String reverseString(String string){
        String reversedObject = "";
        for(int i = string.length()-1; i>=0; i--){
            reversedObject = reversedObject+string.charAt(i);
        }
        return reversedObject;
    }
    private static String reverseUsingCharArray(String s){
        String s1 = "";
        char []s2 = s.toCharArray();
        for (int i = s2.length-1; i>=0; i--){
            s1 = s1+s2[i];
        }
    return s1;
    }

    private static String usingStringBuffer(String s){
        StringBuffer buffer = new StringBuffer(s);
        String string = String.valueOf(buffer.reverse());
        return string;
    }

}
