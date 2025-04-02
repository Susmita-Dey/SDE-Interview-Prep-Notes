/*
 * Leetcode question: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 * Difficulty: Easy
*/

public class SwapStringsCheckEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        // If the strings are already equal, no swap is needed
        if (s1.equals(s2)) {
            return true;
        }

        // List to store the indices where s1 and s2 differ
        int first = -1, second = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false; // More than two mismatches → Not possible with one swap
                }
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // There must be exactly 2 mismatched characters, and they must be swappable
        return count == 2 &&
                s1.charAt(first) == s2.charAt(second) &&
                s1.charAt(second) == s2.charAt(first);
    }
}
