public class Product_Function {

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int prod = multiply(a,b);
        System.out.println(prod);
        prod = multiply(30,100);
        System.out.println(prod);
        prod = multiply(200,300);
        System.out.println(prod);
    }
}