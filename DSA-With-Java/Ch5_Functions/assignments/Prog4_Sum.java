
import java.util.Scanner;

public class Prog4_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + result);
        sc.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
