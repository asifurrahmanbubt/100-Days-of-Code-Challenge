import java.util.*;

public class Parameters{

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int total = calculateSum(a,b);
        System.out.println("The total sum is "+total);
    }
}