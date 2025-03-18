
import java.util.Scanner;

public class Prog7_CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        if (ans) {
            System.out.println(num+" is a prime number.");
        }
        System.out.println(num+" is not a prime number.");
        sc.close();
    }

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }
}
