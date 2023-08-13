import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }

    // print all 3-digit Armstrong Numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }

    // checking for prime numbers
    static boolean isPrime(int n) {
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
