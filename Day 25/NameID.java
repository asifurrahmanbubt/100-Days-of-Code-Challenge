import java.util.Scanner;

public class NameID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter your ID: ");
        Long id = sc.nextLong();
        System.out.println("Your ID is " + id);
    }
}