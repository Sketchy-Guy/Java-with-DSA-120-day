package Day2ofJava;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Take input from user till user does not press X or x
        while (true) {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            System.out.println("Enter operator (+, -, *, /) or 'X' to exit: ");
            char operator = input.next().charAt(0);

            if ((operator == 'X') || (operator == 'x')) {
                System.out.println("Exiting the calculator.");
                break;
            }

            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
                    break;
            }
        }
        input.close();
    }
}
