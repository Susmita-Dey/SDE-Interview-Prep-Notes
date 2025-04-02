/*
 * Leetcode question: https://leetcode.com/problems/rank-transform-of-an-array/
 * Difficulty level: Easy
*/

import java.util.*;

public class RankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            // Assign a rank to each unique value (ignore duplicates)
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Create the result array with ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        System.out.println("\nEnter array elements::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] rankedArray = arrayRankTransform(arr);

        System.out.println("Rank Transformed Array:");
        for (int i = 0; i < rankedArray.length; i++) {
            System.out.print(rankedArray[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
