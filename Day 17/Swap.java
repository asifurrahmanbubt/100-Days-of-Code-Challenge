public class Swap{

    public static void swap(int a, int b){
        int temp = a;
        a =b;
        b = temp;
        System.out.println("Value of A after Swap is: " + a);
        System.out.println("Value of B after Swap is: " + b);
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        swap(a,b);
    }
}