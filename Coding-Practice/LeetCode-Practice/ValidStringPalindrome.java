/*
 * Leetcode question: https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 */

import java.util.Scanner;

public class ValidStringPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int start = 0, end = s.length() - 1;

        while (start <= end) {
            char chf = s.charAt(start);
            char chl = s.charAt(end);

            if (!Character.isLetterOrDigit(chf)) {
                start++;
            } else if (!Character.isLetterOrDigit(chl)) {
                end--;
            } else {
                if (chf != chl) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sentence = sc.next();
        System.out.println(isPalindrome(sentence));

        sc.close();
    }
}
