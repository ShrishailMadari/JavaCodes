package arrays;

import java.util.Scanner;

public class FindingMissingNumber {
    public static void main(String[] args) {
        System.out.println("Finding missing number of an array: ");
        int [] array = {1,2,4,5};
        int sumOFCurrentArray = 0;
        for (int i=0; i<array.length; i++){
            sumOFCurrentArray = sumOFCurrentArray + array[i];
        }
        System.out.println("sum of given array is: "+sumOFCurrentArray);

        int sumOfActualArray = 0;
        for (int i = 1; i<=5; i++){
            sumOfActualArray = sumOfActualArray + i;
        }
        System.out.println("sum of actual array is: "+sumOfActualArray);
        int missingNumber = sumOfActualArray - sumOFCurrentArray;
        System.out.println("missing number is "+ missingNumber);
    }
}
