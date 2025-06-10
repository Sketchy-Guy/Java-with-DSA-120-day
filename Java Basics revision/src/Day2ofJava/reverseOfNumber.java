package Day2ofJava;

public class reverseOfNumber {
    public static void main(String[] args) {
        int number1 = 78678;
        int ans = 0;
        while (number1 > 0) {
            int remainder = number1 % 10;
            number1 = number1 / 10;
            ans = ans * 10 + remainder; // Build the reversed number

        }
        System.out.println(ans);

    }
}