/*
 * Q1. Find the Most Common Response
Medium
4 pt.
You are given a 2D string array responses where each responses[i] is an array of strings representing survey responses from the ith day.

Return the most common response across all days after removing duplicate responses within each responses[i]. If there is a tie, return the lexicographically smallest response.

A string a is lexicographically smaller than a string b if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
If the first min(a.length, b.length) characters do not differ, then the shorter string is the lexicographically smaller one.
 

Example 1:

Input: responses = [["good","ok","good","ok"],["ok","bad","good","ok","ok"],["good"],["bad"]]

Output: "good"

Explanation:

After removing duplicates within each list, responses = [["good", "ok"], ["ok", "bad", "good"], ["good"], ["bad"]].
"good" appears 3 times, "ok" appears 2 times, and "bad" appears 2 times.
Return "good" because it has the highest frequency.
Example 2:

Input: responses = [["good","ok","good"],["ok","bad"],["bad","notsure"],["great","good"]]

Output: "bad"

Explanation:

After removing duplicates within each list we have responses = [["good", "ok"], ["ok", "bad"], ["bad", "notsure"], ["great", "good"]].
"bad", "good", and "ok" each occur 2 times.
The output is "bad" because it is the lexicographically smallest amongst the words with the highest frequency.
 

Constraints:

1 <= responses.length <= 1000
1 <= responses[i].length <= 1000
1 <= responses[i][j].length <= 10
responses[i][j] consists of only lowercase English letters

 */

import java.util.*;

public class contest {

    public static String findCommonResponse(List<List<String>> responses) {
        String ans = "";
        Map<String, Integer> map = new HashMap<>();
        for (List<String> response : responses) {
            Set<String> uniqueResponses = new HashSet<>(response);
            for (String res : uniqueResponses) {
                map.put(res, map.getOrDefault(res, 0) + 1);
            }
        }
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                ans = entry.getKey();
            } else if (entry.getValue() == maxCount) {
                ans = ans.compareTo(entry.getKey()) < 0 ? ans : entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}