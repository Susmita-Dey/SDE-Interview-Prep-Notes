/*
 * Leetcode question: https://leetcode.com/problems/find-unique-binary-string/
 * Difficulty: Medium
*/

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }

        return ans.toString();
    }
}
