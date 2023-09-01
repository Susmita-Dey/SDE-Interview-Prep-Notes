// Q.3. Calculate Average Of N Numbers 

import java.util.Scanner;

public class Prog3_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Average of " + n + " is " + (sum / n));
        sc.close();
    }
}
