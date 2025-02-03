/*
 * Leetcode question: https://leetcode.com/problems/climbing-stairs/
 * Difficulty level: Easy
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int tmp = a;
            a = b;
            b = a + tmp;
        }
        return b;
    }
}
