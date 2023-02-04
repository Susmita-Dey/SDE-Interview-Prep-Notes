// Q:- Take 2 numbers as input and print the largest number. 

import java.util.Scanner;

public class Prog5_LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input two numbers
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        // checking for largest number 
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both are equal.");
        }
        
        in.close();
    }
}
