/*
 * Leetcode question: https://leetcode.com/problems/plus-one/
 * Difficulty: Easy
*/

import java.util.Scanner;

public class ElementPlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        System.out.println("\nEnter array elements::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] plusOneDigits = plusOne(arr);

        System.out.println("Digits after increment:");
        for (int num : plusOneDigits) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
