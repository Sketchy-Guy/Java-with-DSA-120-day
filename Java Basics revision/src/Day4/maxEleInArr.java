package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class maxEleInArr {
    public static void main(String[] args) {
      int[] arr=input();
      System.out.println("Arr elements are  :\n"+ Arrays.toString(arr));
      System.out.println("Max element is "+findMax(arr));
    }
    public static int[] input(){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = input2.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number for "+ i + "th index");
            arr[i]= input.nextInt();
        }
        return arr;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
