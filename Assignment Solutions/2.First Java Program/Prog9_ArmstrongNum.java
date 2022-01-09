// Q:- To find Armstrong Number between two given number. 

import java.util.Scanner;

public class Prog9_ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        int rem, sum = 0, num = n;

        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        // checking for armstrong number 
        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        
        sc.close();
    }
}
