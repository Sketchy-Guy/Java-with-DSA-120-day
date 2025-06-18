package Day4;

import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {

//        int [] [] arr = {
//                {1,2,3},
//                {1,5,8,9},
//                {7,8}
//        };
        Scanner input = new Scanner(System.in);
        // Take row size as input
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        int [] [] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int cols = input.nextInt();
            arr[i] = new int[cols];
//            for each column in every row
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at arr[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }

}

