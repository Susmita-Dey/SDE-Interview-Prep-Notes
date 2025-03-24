/*
 * Leetcode question: https://leetcode.com/problems/adding-spaces-to-a-string/
 * Difficulty level: Easy
 * Time complexity: O(N)
 * Space complexity: O(N)
 */

import java.util.Scanner;

public class AddSpaceToString {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string having no spaces: ");
        String s = sc.nextLine();
        System.out.print("Enter length of array: ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        System.out.println("\nEnter space indexes::");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original String: " + s);
        System.out.println("Fancy String: " + addSpaces(s, arr));

        sc.close();
    }
}
