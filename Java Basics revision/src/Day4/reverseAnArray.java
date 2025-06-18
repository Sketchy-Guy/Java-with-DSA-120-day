package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = input();
        System.out.println("Before reversing :\n"+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("after reversing :\n"+ Arrays.toString(arr));
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
    static void swap(int[] arr,int idx1,int idx2){
        if(idx1 >= 0 && idx1 < arr.length && idx2 >= 0 && idx2 < arr.length){
                int temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2]= temp;
        }
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start< end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
