import java.util.*;

public class PassOrFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String type = a>=33 ? "Pass" : "Fail";
        System.out.println(type);
    }
}