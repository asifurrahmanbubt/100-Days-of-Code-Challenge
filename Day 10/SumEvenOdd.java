import java.util.*;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Integers: ");
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;

        System.out.println("Enter the number: ");
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            if(number % 2 == 0){
                evensum += number;
            } else{
                oddsum += number;
            }
        }
        System.out.println("The sum of even numbers is: " + evensum);
        System.out.println("The sum of odd numbers is: " + oddsum);
    }
}