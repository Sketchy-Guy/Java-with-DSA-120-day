package Day2ofJava;

import java.util.Scanner;

public class for_loops {
//    print numbers from 1 to n
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    System.out.println("Numbers from 1 to " + n + ":");
    for (int i = 1; i<=n; i++){
        System.out.print( i);
        if (i<n){
            System.out.print(",");
        }
    }
    System.out.println();
    System.out.print("Sum of numbers from 1 to " + n + ":");
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    System.out.println(sum);
}
}
