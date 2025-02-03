/*
 * Leetcode question: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
 * Difficulty: Easy
 * Time complexity: O(n)
 * Space complexity: O(1)
*/

class LongestStrictlyIncDecSubarray {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, maximum = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc += 1;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                inc = 1;
                dec += 1;
            } else {
                inc = 1;
                dec = 1;
            }
            maximum = Math.max(maximum, Math.max(inc, dec));
        }
        return maximum;
    }
}
