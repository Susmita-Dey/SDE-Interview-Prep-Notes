// Q:- To calculate Fibonacci Series up to n numbers. 

import java.util.Scanner;

public class Prog7_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth value:- ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1, temp = 0;
        System.out.println("Fibonnaci Series upto " + n + "th term :- ");

        while (temp < n) {
            System.out.print(temp + " "); // printing the series
            n1 = n2;
            n2 = temp;
            temp = n1 + n2;
        }

        sc.close();
    }
}
