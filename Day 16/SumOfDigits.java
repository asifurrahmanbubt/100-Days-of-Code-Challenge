import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        N = Math.abs(N); // Consider only the absolute value of N

        while (N > 0) {
            sum += N % 10;  // Add the last digit to sum
            N /= 10;        // Remove the last digit
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
