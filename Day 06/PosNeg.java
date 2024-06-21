import java.util.*;

public class PosNeg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n>0){
            System.out.println("Positive Number");
        }
        else if (n == 0){
            System.out.println("Neither Positive, Neither Negative");
        }
        else {
            System.out.println("Negative Number");
        }
    }
}