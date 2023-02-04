
// Q.7. Power In Java
import java.util.Scanner;

public class Prog7_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and the power:");
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(num + " to the power of " + pow + " is: " + Math.pow(num, pow));
        sc.close();
    }
}
