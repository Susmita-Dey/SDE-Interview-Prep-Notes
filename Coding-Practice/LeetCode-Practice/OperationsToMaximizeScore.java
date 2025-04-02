/*
 * Leetcode question: https://leetcode.com/problems/apply-operations-to-maximize-score/
 * Difficulty level: Hard
 * Time complexity: O(N log N)
 * Space complexity: O(N)
 * This code calculates the maximum score by applying operations on an array of integers.
 */

import java.util.*;

public class OperationsToMaximizeScore {
    private static final int MOD = 1_000_000_007;

    // Helper method to calculate prime score (count of distinct prime factors)
    private static int calculatePrimeScore(int num) {
        int score = 0;
        // Check for divisibility by 2
        if (num % 2 == 0) {
            score++;
            while (num % 2 == 0) {
                num /= 2;
            }
        }

        // Check for divisibility by odd numbers starting from 3
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                score++;
                while (num % i == 0) {
                    num /= i;
                }
            }
        }

        // If num is a prime number greater than 2
        if (num > 1) {
            score++;
        }

        return score;
    }

    // Fast exponentiation to calculate (base^exp) % MOD
    private static long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }

    public static int maximumScore(List<Integer> nums, int k) {
        int n = nums.size();

        // Calculate prime scores for each element
        int[] primeScores = new int[n];
        for (int i = 0; i < n; i++) {
            primeScores[i] = calculatePrimeScore(nums.get(i));
        }

        // Find left boundary: nearest element with greater or equal prime score
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && primeScores[stack.peek()] < primeScores[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Find right boundary: nearest element with greater prime score
        int[] right = new int[n];
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && primeScores[stack.peek()] <= primeScores[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Create indices array for sorting
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices by values in descending order
        Arrays.sort(indices, (a, b) -> nums.get(b) - nums.get(a));

        // Apply operations greedily
        long result = 1;
        for (int i = 0; i < n && k > 0; i++) {
            int idx = indices[i];
            // Calculate number of subarrays where this element would be chosen
            long count = (long) (idx - left[idx]) * (right[idx] - idx);
            // Use this element as many times as possible (limited by k)
            long times = Math.min(count, k);

            // Multiply the score
            result = (result * power(nums.get(idx), times)) % MOD;

            // Reduce remaining operations
            k -= times;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int lengthArr = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.println("\nEnter array elements::");
        for (int i = 0; i < lengthArr; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("\nEnter integer value of k: ");
        int k = sc.nextInt();

        System.out.println("Maximum score: " + maximumScore(arr, k));

        sc.close();
    }
}