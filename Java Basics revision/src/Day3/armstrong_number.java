package Day3;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's armstrong number or not");
        int num = input.nextInt();
        boolean ans = isArmstrong(num);
        if (!ans){
            System.out.println("Not a Armstrong number");
        }
        else {
            System.out.println("Is a Armstrong number");}
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int remainder = n % 10;
            n =n/10;
            sum = sum + remainder*remainder*remainder;

        }
        return sum == original ; //As it is boolean return will always return true or false no need to write if elese
    }

}
