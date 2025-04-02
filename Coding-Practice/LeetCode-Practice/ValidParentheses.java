/*
 * Leetcode question:- https://leetcode.com/problems/valid-parentheses/
 * Difficulty level: Easy
 * Time Complexity for my solution is O(N)
 */

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // Push the opening brackets onto the stack
            if (current == '(' || current == '[' || current == '{') {
                st.push(current);
            }
            // Handle closing brackets
            else {
                // If stack is empty, there's no matching opening bracket
                if (st.isEmpty())
                    return false;

                char top = st.pop();
                // Check if the current closing bracket matches the top of the stack
                if ((current == ')' && top != '(') ||
                        (current == ']' && top != '[') ||
                        (current == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // In the end, the stack should be empty if all brackets matched
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        String s1 = "([])";
        String s2 = "()[]{}";
        String s3 = "([)]";

        boolean check = isValid(s);
        System.out.println(check); // Should print true

        check = isValid(s1);
        System.out.println(check); // Should print true

        check = isValid(s2);
        System.out.println(check); // Should print true

        check = isValid(s3);
        System.out.println(check); // Should print false
    }
}
