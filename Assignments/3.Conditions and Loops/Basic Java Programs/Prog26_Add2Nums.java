import java.util.Scanner;

public class Prog26_Add2Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("Sum of " + n + " and " + m + " is " + sum);
        sc.close();
    }
}
