/*
 * Leetcode question: https://leetcode.com/problems/two-sum/
 * Difficulty level: Easy
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] output = twoSum(arr, target);
        System.out.println(output);
    }
}
