/*
 * Leetcode question: https://leetcode.com/problems/largest-number/
 * Difficulty level: Medium
 * Time complexity: O(nlogn)
 * Space complexity: O(n)
 */

import java.util.*;;

public class ArrangeLargestNumber {
    public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            str[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder largest = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            largest.append(str[i]);
        }

        return largest.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        String result = largestNumber(nums);
        System.out.println("Largest number: " + result);
    }
}
