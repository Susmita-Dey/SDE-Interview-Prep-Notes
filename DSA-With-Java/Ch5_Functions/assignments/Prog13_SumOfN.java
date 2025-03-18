import java.util.Scanner;

public class Prog13_SumOfN {
    public static int sumOfNums(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " numbers: " + sumOfNums(n));

        sc.close();
    }
}
