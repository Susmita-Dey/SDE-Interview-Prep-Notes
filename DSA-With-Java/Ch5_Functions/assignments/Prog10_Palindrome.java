package assignments;

import java.util.Scanner;

public class Prog10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean ans = isPalindrome(number);
        if (ans) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        sc.close();
    }

    static boolean isPalindrome(int num) {
        int rem = 0, sum = 0, original = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        return original == sum;
    }
}
