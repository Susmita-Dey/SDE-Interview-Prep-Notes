import java.util.Scanner;

public class Prog12_PrimeNumbersRange {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void getPrimeNumbers(int n, int m) {
        System.out.println("Prime numbers between " + n + " and " + m + " are:");
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        getPrimeNumbers(n,m);

        sc.close();
    }
}
