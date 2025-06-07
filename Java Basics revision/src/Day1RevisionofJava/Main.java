package Day1RevisionofJava;

import java.util.Scanner;

//learned about packages
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input1.nextLine();
        System.out.println(name);
    }
}