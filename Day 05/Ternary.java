import java.util.*;

public class Ternary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String type = ((a%2)==0)? "Even" : "Odd";
        System.out.println(type);
    }
}