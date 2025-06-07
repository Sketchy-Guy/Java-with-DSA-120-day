package Day2ofJava;

public class count_nums {
    public static void main(String[] args) {
        int n = 345567590;
        int count = 0;
        while (n> 0){
            int remainder =  (n % 10); // Get the last digit
            if (remainder == 5) {
                count++; // Increment count if the digit is 5
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
