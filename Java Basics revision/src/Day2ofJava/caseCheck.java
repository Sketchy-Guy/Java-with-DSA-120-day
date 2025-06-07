package Day2ofJava;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        char ch = str.next().trim().charAt(0);
        if (ch>= 'a' && ch <= 'z'){
            System.out.println("The character is in lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is in uppercase");
        } else {
            System.out.println("The character is not an alphabet");
        }
    }
}
