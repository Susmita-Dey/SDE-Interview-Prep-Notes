// Q.13. Sum Of N Numbers 

import java.util.Scanner;

public class Prog13_SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum Of N Numbers is: " + sum);
        sc.close();
    }
}
