package Day2ofJava;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        int i = 1;
        while (i <= n) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
