import java.util.Scanner;

public class Prog22_SubtractProductSum {
    public static int subtractProductAndSum(int n) {
        int prod = 1, sum = 0, rem = 0, res;

        while (n > 0) {
            rem = n % 10;
            prod = prod * rem;
            sum = sum + rem;
            n = n / 10;
        }
        res = prod - sum;
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = subtractProductAndSum(n);
        System.out.println(res);
        sc.close();
    }
}