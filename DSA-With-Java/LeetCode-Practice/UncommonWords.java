/*
 * Leetcode question: https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * Difficulty: Easy
 */

import java.util.*;

public class UncommonWords {
    public static String[] uncommonFromSentences(String s1, String s2) {
        // Create a HashMap to store word frequencies
        HashMap<String, Integer> map = new HashMap<>();

        // Split both sentences into words
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        // Add all words from first sentence to the map with their counts
        for (String word : arr1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // System.out.println(map);

        // Add all words from second sentence to the map with their counts
        for (String word : arr2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // System.out.println(map);

        // Collect all words that have a frequency of 1 (uncommon words)
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        // Convert the result list to an array and return it
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first sentence
        System.out.print("Enter first sentence: ");
        String s1 = sc.nextLine();

        // Input second sentence
        System.out.print("Enter second sentence: ");
        String s2 = sc.nextLine();

        // Close the scanner
        sc.close();

        // Call the uncommonFromSentences function
        String[] result = uncommonFromSentences(s1, s2);

        // Print the result
        System.out.println("\nUncommon Words: " + Arrays.toString(result));
    }
}
