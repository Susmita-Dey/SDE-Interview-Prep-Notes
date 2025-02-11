/*
 * Leetcode question: https://leetcode.com/problems/clear-digits/
 * Difficulty: Easy
*/

import java.util.Stack;

public class ClearDigits {
    public static String clearDigitsFunc(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "abc";
        System.out.println(clearDigitsFunc(a));
        String b = "abc123";
        System.out.println(clearDigitsFunc(b));
    }
}
