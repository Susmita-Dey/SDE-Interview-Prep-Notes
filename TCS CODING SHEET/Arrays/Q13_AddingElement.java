/* Adding Element in an Array
Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4
*/

package Arrays;

import java.util.*;

public class Q13_AddingElement {
    public static int[] insertAtBeginning(int[] arr, int n, int value) {
        int[] newArr = new int[n + 1];
        newArr[0] = value;
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertAtEnd(int[] arr, int n, int value) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;
        return newArr;
    }

    public static int[] insertAtPos(int[] arr, int n, int pos, int value) {
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position!");
            return arr;
        }
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i <= n; i++) {
            if (i == pos - 1) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Insert at beginning
        System.out.print("Enter value to insert at the beginning: ");
        int value = sc.nextInt();
        arr = insertAtBeginning(arr, n, value);
        n++;

        // Insert at end
        System.out.print("Enter value to insert at the end: ");
        value = sc.nextInt();
        arr = insertAtEnd(arr, n, value);
        n++;

        // Insert at specific position
        System.out.print("Enter position to insert value: ");
        int pos = sc.nextInt();
        System.out.print("Enter value to insert at the position: ");
        value = sc.nextInt();
        arr = insertAtPos(arr, n, pos, value);
        n++;

        // Display final array
        System.out.print("Final array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
