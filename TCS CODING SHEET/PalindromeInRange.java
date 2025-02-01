/*
 * Q: Find all palindrome numbers in the range of A to B.
 * Input: A = 100, B = 150
 * Output: [101,111]
 * ASKED IN TCS NQT - FIRST SHIFT - 03/10/2024
*/

import java.util.*;

public class PalindromeInRange {

    public static boolean isPalindrome(int num) {
        int rem = 0, rev = 0, original = num;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        return original == rev;
    }

    public static ArrayList<Integer> getPalindromeArray(int a, int b) {
        ArrayList<Integer> palindromeList = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (isPalindrome(i)) {
                palindromeList.add(i);
            }
        }

        return palindromeList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers::");
        int A = sc.nextInt();
        int B = sc.nextInt();

        ArrayList<Integer> palinNums = getPalindromeArray(A, B);

        System.out.println("List of Palindrome numbers between " + A + " and " + B + " are:");
        for (int num : palinNums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
