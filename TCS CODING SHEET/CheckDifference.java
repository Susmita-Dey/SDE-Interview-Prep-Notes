/*
 * TCS NQT - 05/10/2024
 * Q.2 Given an integer array nums and an integer k, return the number of pairs (i, j) where i<j such that [nums[i] - nums[j]| == k.

 * Input:
 * nums = 10, 5, 15, 20, 25
 * k = 5
 * Output: 4
 * Explanation: (10,5),(5,15),(15,20),(20,25)
 * the difference between each pairs is 5 which is equal to k, so total count for no of pairs having k difference is 4.
 * 
 * Note: Here the array input is taken as a string as it contains space after each element.
*/

import java.util.Scanner;

public class CheckDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nums = sc.nextLine();
        String[] numStrings = nums.split(" ");
        int[] arr = new int[numStrings.length - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numStrings[i]);
        }

        int k = Integer.parseInt(numStrings[numStrings.length - 1]);
        int count = 0;

        // Find pairs (i, j) where i < j and |arr[i] - arr[j]| == k
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
