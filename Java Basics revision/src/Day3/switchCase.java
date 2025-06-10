package Day3;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 to check its weekend or week day: ");
        int number = input.nextInt();
        switch (number) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's a weekday.");
            case 6, 7 -> System.out.println("It's a weekend.");
        }
    }
}
