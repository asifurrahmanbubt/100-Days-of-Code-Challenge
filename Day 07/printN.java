import java.util.*;

public class printN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}