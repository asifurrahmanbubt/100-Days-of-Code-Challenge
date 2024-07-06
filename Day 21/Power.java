public class Power {
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(5, 0)); // Output: 1
    }
}
