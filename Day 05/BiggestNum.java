import java.util.*;

public class BiggestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " Is the Biggest Number");
        }
        else if (b>c){
            System.out.println(b + " Is the Biggest Number");
        }
        else {
            System.out.println(c + " Is the Biggest Number");
        }
    }
}