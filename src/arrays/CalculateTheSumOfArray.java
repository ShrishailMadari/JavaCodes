package arrays;

import java.util.Scanner;

public class CalculateTheSumOfArray {
    public static void main(String[] args) {
        //finding Max number in array
        maxNumBOfArray();
        //search the given element x in the array if present return the index else -1
        findElement();
        //finding Sum Of Array
        sumOfArray();
    }

    static void sumOfArray(){
        int[] arr = {1,98,38,45,6,27,8};
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[1];
        }
        System.out.println(sum);
    }

    static void maxNumBOfArray(){
        int[] arr = {100,98,38,45,6,27,8};
        int maxNumber = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]> maxNumber){
                maxNumber = arr[i];
            }
        }
        System.out.println(maxNumber);
    }

    static void findElement() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int num = obj.nextInt();
        int number = -1;
        int[] arr = {100, 98, 38, 45, 6, 27, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                number = i;
                break;
            }
        }
        System.out.println(num + " is at index: " + number);
    }



}

