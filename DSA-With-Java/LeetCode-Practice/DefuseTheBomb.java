/*
 * Leetcode question: https://leetcode.com/problems/defuse-the-bomb/
 * Difficulty level: Easy
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

import java.util.Scanner;

public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length; // circular array
        int[] result = new int[n];

        if (k == 0)
            return result;

        int wSum = 0;
        int start = (k > 0) ? 1 : n + k;
        int end = (k > 0) ? k : n - 1;

        for (int i = start; i <= end; i++) {
            wSum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            result[i] = wSum;
            wSum -= code[(start + i) % n];
            wSum += code[(end + i + 1) % n];
        }

        return result;
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

        System.out.print("\nEnter integer value of key: ");
        int k = sc.nextInt();

        int[] decryptedCode = decrypt(arr, k);

        System.out.println("\nDecrypted code to defuse the bomb:");
        for (int num : decryptedCode) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
