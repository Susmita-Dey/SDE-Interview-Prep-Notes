
import java.util.Scanner;

public class Prog9_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int ans = getFactorial(number);
        System.out.println("Factorial of " + number + " is: " + ans);
        sc.close();
    }

    static int getFactorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        return f;
    }
}
