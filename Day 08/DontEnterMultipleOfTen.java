import java.util.*;

public class DontEnterMultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("The number is divisible by 10. So BYE!");
                break;
            }
            System.out.println(n);
        }while(true);
    }
}