// Q.8. Calculate Depreciation of Value 
import java.util.Scanner;

public class Prog8_Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some amount:");
        double amount = sc.nextDouble();
        double depreciation = amount / 100;
        System.out.println("Calculate Depreciation of Value is = " + depreciation);
        sc.close();
    }
}
