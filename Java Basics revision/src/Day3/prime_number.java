package Day3;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's prime or not");
        int num = input.nextInt();
        boolean ans = isPrime(num);
        if (!ans){
            System.out.println("Not a prime number");
        }
        else {
            System.out.println("Is a prime number");}
//        System.out.println(ans);

    }
    static boolean isPrime(int a){
        if (a <= 1) return false;
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0)
                return false;
            c++;
        }
        return true;


    }
}
