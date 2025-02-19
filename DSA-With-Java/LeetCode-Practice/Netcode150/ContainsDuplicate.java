/*
 * Leetcode question: https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
*/

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNum = new HashSet<>();

        for (int num : nums) {
            if (seenNum.contains(num)) {
                return true;
            }
            seenNum.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (containsDuplicate(nums)) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Array does not contain duplicate elements");

        }

        sc.close();
    }
}
