import java.util.Scanner;

public class Update_Marks {
    public static void main(String[] args) {
        int[] marks = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy:" + marks[0]);
        System.out.println("Chem:" + marks[1]);

        marks[2] = marks[2] + 1;
        System.out.println("Math:" + marks[2]);
    }
}