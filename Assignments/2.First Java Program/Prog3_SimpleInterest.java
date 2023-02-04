// Q:- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Prog3_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of principal amount, time and rate of interest. 
        System.out.print("Enter the Principal amount:- ");
        int P = sc.nextInt();
        System.out.print("Enter the Time:- ");
        int T = sc.nextInt();
        System.out.print("Enter the Rate Of Interest:- ");
        double R = sc.nextDouble();

        // calculating the simple interest 
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest = " + SI);

        sc.close();
    }
}
