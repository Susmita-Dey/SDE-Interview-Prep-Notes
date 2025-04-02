/*
 * Leetcode question: https://leetcode.com/problems/length-of-last-word/
 * Difficulty: Easy
*/

import java.util.Scanner;

public class LastWordLength {
    public int lengthOfLastWordAnotherSolution(String s) {

        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ')
                count++;
            else
                return count;
        }
        return count;

    }

    public static int lengthOfLastWord(String str) {
        String[] words = str.split(" ");
        int length = words[words.length - 1].length();
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to calculate length of last word: ");
        String s = sc.nextLine();

        int len = lengthOfLastWord(s);
        System.out.println("Length of last word is: " + len);
        sc.close();
    }
}
