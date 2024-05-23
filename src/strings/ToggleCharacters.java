package strings;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        System.out.println("Toggle characters: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder value = new StringBuilder(scanner.nextLine());
        System.out.println(value);
        System.out.println();
        System.out.println("Toggling the input: "+value);
        for (int i = 0; i < value.length(); i++){
            boolean flag = true; // consider we hv capital letter by making flag true
            char ch = value.charAt(i);
            if(ch ==' ')
                continue;
            int ascii = (int)ch;
            if(ascii>=97){
                flag = false; // here its small value
            }
            if(flag == true){
                ascii = ascii + 32;
                char cha = (char) ascii;
                value.setCharAt(i,cha);
            }else {
                ascii = ascii - 32;
                char cha = (char) ascii;
                value.setCharAt(i,cha);
            }
        }
        System.out.println(value);
    }
}
