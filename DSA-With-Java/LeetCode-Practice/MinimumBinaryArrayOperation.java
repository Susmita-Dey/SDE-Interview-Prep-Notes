/*
 * Leetcode Question: https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/
 * Difficulty: Medium
 * Approach: If there's 0, then replace with 1 and we have always choose 3 consecutive elements in the array and make the changes checking if 0 then 1 else put 0. Also, we need to check if the last 2 elements in the array contains 0, then we cannot make 3 pairs for them so we need to return -1.

 Example 1:
Input: nums = [0,1,1,1,0,0]
Output: 3

Explanation:
We can do the following operations:
Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].

Example 2:
Input: nums = [0,1,1,1]
Output: -1

Explanation:
It is impossible to make all elements equal to 1.
*/

import java.util.Scanner;

public class MinimumBinaryArrayOperation {
    public static int minOperations(int[] nums) {
        int len = nums.length;

        int count = 0;
        for (int i = 0; i <= len - 3; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
                count++;
            }
        }

        if (nums[len - 2] == 0 || nums[len - 1] == 0) {
            return -1;
        }

        return count;
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

        System.out.println("Minimum operations: " + minOperations(arr));
        sc.close();
    }
}
