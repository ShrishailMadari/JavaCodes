package arrays;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("reverse of the array: ");
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        System.out.println("enter the array Elements: ");
        int[] elements = new int[size];
        for (int i = 0; i<elements.length; i++){
            elements[i]=obj.nextInt();
        }
        System.out.println("Before reverse array elements are: ");
        for (int i = 0; i<elements.length; i++){
            System.out.print(elements[i]+" ");
        }

        reverseArray(elements);

        System.out.println("after reversing: ");
        for (int i=0; i<elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
    static void reverseArray(int[] elements){
        int i = 0; int j = elements.length-1;
        while (i < j) {
            int temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
            i++; j--;
        }
    }
}

