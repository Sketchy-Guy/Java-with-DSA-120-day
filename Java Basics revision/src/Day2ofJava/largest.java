package Day2ofJava;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first elements: ");
        int a = input.nextInt();
        System.out.print("Enter the second elements: ");
        int b = input.nextInt();
        System.out.print("Enter the third elements: ");
        int c = input.nextInt();
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("The largest number is: " + largest);
    }
}
