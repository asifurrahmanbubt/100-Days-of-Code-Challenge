import java.util.Scanner;

public class FavoriteAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite animal: ");
        String animal = scanner.nextLine();

        System.out.println("Your favorite animal is " + animal + ".");
    }
}
