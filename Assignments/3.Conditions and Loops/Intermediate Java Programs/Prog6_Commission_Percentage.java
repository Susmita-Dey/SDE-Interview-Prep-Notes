// Q.6. Calculate Commission Percentage 
import java.util.Scanner;

public class Prog6_Commission_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        int commission = sc.nextInt();
        int commissionPercentage = sales * commission / 100;
        System.out.println("Commission Percentage is " + commissionPercentage);
        sc.close();
    }
}
