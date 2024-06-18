import java.util.*;

public class cost{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float gst = 0.18f;
        float cost = (a+b+c);
        float gst_amount = cost*gst;
        float total = cost+gst_amount;
        System.out.println("The Total Cost with GST :" + total);
    }
}