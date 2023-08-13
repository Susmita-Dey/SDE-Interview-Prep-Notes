// Q: Find the largest number among 3 numbers. 

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;
        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }

        // int max = 0;
        // if (a > b) {
        // max = a;
        // } else {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }

        int max = Math.max(Math.max(a, b), c);

        System.out.println(max);
        in.close();
    }
}
