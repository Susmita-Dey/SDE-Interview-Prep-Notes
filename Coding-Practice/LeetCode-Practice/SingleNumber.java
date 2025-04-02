/*
 * Leetcode question: https://leetcode.com/problems/single-number/
 * Difficulty: Easy
 */

import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            // Performing XOR operation to cancel all duplicate pairs from the array
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array:");
        int len = sc.nextInt();
        System.out.println("Enter numbers for an array:");
        int[] nums = new int[len];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int res = singleNumber(nums);
        System.out.println("Single number returning from the array is: " + res);

        sc.close();
    }
}
