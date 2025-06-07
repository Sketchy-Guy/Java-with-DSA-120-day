package Day1RevisionofJava;

import java.util.Scanner;

public class temp_conversion {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        float celc = input1.nextFloat();
        float fahrenheit = (celc*9/5)+32;
        System.out.println(fahrenheit);
    }
}
