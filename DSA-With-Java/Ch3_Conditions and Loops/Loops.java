// Q: Print numbers from 1 to 5 and 1 to n

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         * Syntax of For loops:
         * 
         * for(initialisation; condition; increment/decrement) {
         * // body
         * }
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            // System.out.print(i + " ");
            System.out.println("Hello World!");
        }
        in.close();

        // while loops
        /*
         * Syntax of While loops:
         * 
         * while (condition) {
         * // body
         * }
         */

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num = num + 1;
        }

        // do while loops
        /*
         * Syntax of While loops:
         * 
         * do {
         * // body
         * } while (condition)
         */

        int j = 1;
        do {
            System.out.println("Hello World");
        } while (j != 1);
    }
}
