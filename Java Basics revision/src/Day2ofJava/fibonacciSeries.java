package Day2ofJava;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Fibonacci series: ");
        int n = input.nextInt(); // Length of the Fibonacci series
        int a = 0, b = 1; // First two numbers in the series

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i <= n; i++) {
            int next = a + b; // Calculate the next number
            System.out.print(", " + next);
            a = b; // Update a to the previous b
            b = next; // Update b to the new number
        }
    }
}
