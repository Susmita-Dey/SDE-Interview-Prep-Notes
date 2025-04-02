/*
 * Leetcode question: https://leetcode.com/problems/closest-prime-numbers-in-range/
 * Difficulty level: Medium
 * Time complexity: O(N√N)
 * Space complexity: O(N)
 */

import java.util.*;

public class ClosestPrimeInRange {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if (c * c > n) {
            return true;
        }
        return false;
    }

    public static int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Collect all primes in the range [left, right]
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                arr.add(i);
            }
        }

        if (arr.size() < 2) {
            return new int[] { -1, -1 };
        }

        // Find the closest pair of primes
        int minDiff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        for (int i = 1; i < arr.size(); i++) {
            int diff = arr.get(i) - arr.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = arr.get(i - 1);
                num2 = arr.get(i);
            }
        }

        return new int[] { num1, num2 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        int left = sc.nextInt();
        System.out.print("Enter ending value: ");
        int right = sc.nextInt();

        int ans[] = closestPrimes(left, right);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
