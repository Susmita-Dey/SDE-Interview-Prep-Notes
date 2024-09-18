/*
 * Leetcode question: https://leetcode.com/problems/longest-common-prefix/
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        int index = 0;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        while (index < minLength) {
            for (String str : strs) {
                if (str.charAt(index) != strs[0].charAt(index)) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" };
        String[] strs2 = { "dog", "racecar", "car" };

        String prefix1 = longestCommonPrefix(strs1);
        String prefix2 = longestCommonPrefix(strs2);

        System.out.println("Prefix 1: " + prefix1);
        System.out.println("Prefix 2: " + prefix2);
    }
}
