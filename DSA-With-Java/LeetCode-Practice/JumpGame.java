/*
 * Leetcode question: https://leetcode.com/problems/jump-game
 * Difficulty level: Medium
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        if (canJump(nums)) {
            System.out.println("We can jump to the end!");
        } else {
            System.out.println("We cannot jump to the end!");
        }
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0; // the farthest index we can reach so far
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                // if current index is beyond the max reachable index
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]); // update maxReach
            if (maxReach >= n - 1) {
                // check if we can reach or go beyond the last index
                return true;
            }
        }
        return false;
    }
}
