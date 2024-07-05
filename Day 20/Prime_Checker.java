import java.util.*;

public class Prime_Checker {
    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }

        for(int i = 2; i<=n-1;i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}