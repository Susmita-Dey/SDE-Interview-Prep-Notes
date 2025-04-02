/*
 * Leetcode question: https://leetcode.com/problems/score-of-a-string/
 * Difficulty: Easy
*/

import java.util.Scanner;

public class AsciiScoreString {
    public static int scoreOfString(String s) {
        int sum = 0, diff = 0, charToAsc1, charToAsc2;

        for (int i = 0; i < s.length() - 1; i++) {
            charToAsc1 = (int) (s.charAt(i));
            charToAsc2 = (int) (s.charAt(i + 1));

            diff = Math.abs((charToAsc1 - charToAsc2));
            sum += diff;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to calculate it's score: ");
        String s = sc.nextLine();

        int score = scoreOfString(s);
        System.out.println("Score of string " + s + " is: " + score);
        sc.close();
    }
}
