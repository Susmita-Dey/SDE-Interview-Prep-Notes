// Q.4. Calculate Discount Of Product 
import java.util.Scanner;

public class Prog4_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount = sc.nextInt();
        int discountPrice = price - (price * discount / 100);
        System.out.println("Discounted Price is " + discountPrice);
        sc.close();
    }
}
