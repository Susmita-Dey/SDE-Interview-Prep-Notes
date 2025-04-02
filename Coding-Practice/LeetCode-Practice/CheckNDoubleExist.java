/*
 * Leetcode question: https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * Difficulty level: Easy
 * Time complexity: O(N^2)
 * Space complexity: O(1)
 */

import java.util.Scanner;

public class CheckNDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
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

        System.out.println("Does double of N exists in array? " + checkIfExist(arr));

        sc.close();
    }
}
