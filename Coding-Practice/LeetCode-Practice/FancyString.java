/*
 * Leetcode question: https://leetcode.com/problems/delete-characters-to-make-fancy-string/
 * Difficulty level: Easy
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

import java.util.Scanner;

public class FancyString {
    public static String makeFancyString(String s) {
        StringBuilder fancy = new StringBuilder();
        int count = 1;

        fancy.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                fancy.append(s.charAt(i));
            }
        }

        return fancy.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string having duplicate characters: ");
        String s = sc.nextLine();
        System.out.println("Original String: " + s);
        System.out.println("Fancy String: " + makeFancyString(s));

        sc.close();
    }
}
