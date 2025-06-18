package Day4;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = input2.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number for "+ i + "th index");
            arr[i]= input.nextInt();
        }
        System.out.println("Array contents");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
