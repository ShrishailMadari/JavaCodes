package strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        System.out.println("String Methods: ");
        System.out.println("1).Basic Methods:-");
        basicMethods();
        System.out.println();
        System.out.println("2).Compare Methods:- ");
        compareMethods();
        System.out.println();
        System.out.println("3).Searching Methods:-");
        searchingMethods();
        System.out.println();
        System.out.println("4).Modification Methods:-");
        modificationMethods();
        System.out.println("5).other methods:-");
        otherMethods();

    }

    private static void otherMethods() {
        String str = "hello World!";
        System.out.println(str.startsWith("He"));// true
        System.out.println(str.endsWith("lo"));  // true
        boolean empty = str.isEmpty();  // false
        System.out.println(empty);
        String joined = String.join("-", "2014", "10", "31");  // "2014-10-31"
        System.out.println(joined);
        char[] chars = str.toCharArray();  // ['H', 'e', 'l', 'l', 'o']
        System.out.println(chars);
        String numStr = String.valueOf(123);  // "123"
        System.out.println(numStr);
        String obj = "Shri";
        System.out.println(obj.concat("Shail Madari"));


    }

    private static void basicMethods(){
        String obj = "Shrishail Madari";
        System.out.println("length(): "+obj.length());
        System.out.println("charAt(index): "+obj.charAt(4));
        System.out.println("subString(int BeginIndex): "+obj.substring(10));
        System.out.println("subString(int BeginIndex, int endIndex): "+ obj.substring(0,9));


    }
    private static void compareMethods(){
        String obj = "hello World!";
        System.out.println(obj.equals("Hello"));  // true
        System.out.println(obj.equalsIgnoreCase("world"));
        System.out.println(obj.compareTo("Hello"));  // 0 (strings are equal)
        System.out.println(obj.compareToIgnoreCase("hello"));  // 0;
    }
    private static void searchingMethods(){
        String obj = "Hare Krishna";
        System.out.println(obj.indexOf('k'));
        System.out.println(obj.indexOf("Krishna"));
        System.out.println(obj.lastIndexOf('n'));
        System.out.println(obj.contains("Hare"));
    }
    private static void modificationMethods(){
        String str = "ShriMannarayan";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String strWithSpaces = "  Hello  ";
        System.out.println(strWithSpaces.trim());  // "Hello"
        System.out.println(str.replace('S','s'));
        System.out.println(str.replace("Shri","Om "));
        System.out.println(str.split("a"));
    }
}
