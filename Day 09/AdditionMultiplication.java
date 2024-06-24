import java.util.Scanner;

public class AdditionMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        int sum = 0;
        int multiplier = 1;
        for(int i = start; i <= end; i++){
            sum += i;
            multiplier *= i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The multiplier is: " + multiplier);
    }
}