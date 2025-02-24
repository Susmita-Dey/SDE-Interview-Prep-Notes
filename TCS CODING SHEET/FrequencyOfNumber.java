/*
 * Given an array, we have found the number of occurrences of each element in the array.
 * Input: arr[]={10,5,10,15,10,5};
 * Output: 10 3
 *         5 2
 *         15 1
*/

import java.util.*;;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements one by one::");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> occurences = new HashMap<>();

        for (int num : arr) {
            occurences.put(num, occurences.getOrDefault(num, 0) + 1);
        }

        for (int key : occurences.keySet()) {
            System.out.println(key + " occurs " + occurences.get(key) + " times.");
        }

        sc.close();
    }
}