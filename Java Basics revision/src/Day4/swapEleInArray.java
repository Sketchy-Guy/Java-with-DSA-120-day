package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class swapEleInArray {
    public static void main(String[] args) {
     int[] arr = input();
     System.out.println("Before swapping :\n"+ Arrays.toString(arr));
     swap(arr);
     System.out.println("After swapping :\n"+ Arrays.toString(arr));
    }
    public static int[] input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number for "+ i + "th index");
            arr[i]= input.nextInt();
        }
        return arr;
    }
    static void swap(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first index to swap: ");
        int idx1 = scanner.nextInt();
        System.out.print("Enter second index to swap: ");
        int idx2 = scanner.nextInt();
        if(idx1>0 && idx1 < arr.length && idx2>0 && idx2< arr.length ){
            int temp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2]= temp;
        }
    }

}
