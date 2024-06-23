import java.util.*;

public class SkipMultipleOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                System.out.println("The number is divisible by 10. So Skipped!");
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}