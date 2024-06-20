import java.util.*;

public class else_if{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=18){
            System.out.println("Adult");
        }
        else if(a>=13 && a<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}