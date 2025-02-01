/*
 * Leetcode question: https://leetcode.com/problems/merge-two-sorted-lists/
 * Difficulty level: Easy
 */

import java.util.*;

public class MergeTwoSortedLists {
    /**
     * Merges two sorted linked lists into a single sorted linked list.
     *
     * @param list1 the first sorted linked list
     * @param list2 the second sorted linked list
     * @return the merged sorted linked list
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> newList = new ArrayList<>();

        // Add all elements from the first list to the new list
        while (list1 != null) {
            newList.add(list1.val);
            list1 = list1.next;
        }

        // Add all elements from the second list to the new list
        while (list2 != null) {
            newList.add(list2.val);
            list2 = list2.next;
        }

        // Sort the combined list
        Collections.sort(newList);

        // Creating a new linked list from the sorted list
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        for (int num : newList) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        head = head.next;

        return head;
    }

    // Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 2 -> 4 -> 8 -> 9
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(8);
        a.next.next.next = new ListNode(9);

        // Create another hard-coded linked list:
        // 1 -> 3 -> 8 -> 10
        ListNode b = new ListNode(1);
        b.next = new ListNode(3);
        b.next.next = new ListNode(8);
        b.next.next.next = new ListNode(10);

        ListNode res = mergeTwoLists(a, b);

        ListNode temp = res;
        System.out.print("Merged Link List is:\n");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
