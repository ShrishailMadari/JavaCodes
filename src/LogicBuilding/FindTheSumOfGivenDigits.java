package LogicBuilding;

import java.util.Scanner;

public class FindTheSumOfGivenDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the digit to find the sum of it: ");
        int number = obj.nextInt();
        int value = sumOfTheNumber(number);
        System.out.println(value);
    }
    public static int sumOfTheNumber(int number){
        int sum = 0;
        while (number!=0){
            int digit = number%10;// last digit
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    };
}
