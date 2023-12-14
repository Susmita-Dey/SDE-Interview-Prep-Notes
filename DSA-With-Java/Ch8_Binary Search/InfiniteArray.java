/*
 * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
* Source: Amazon Interview Experience. 
* Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array. 
* If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
* Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element, 
-> if it is greater than high index element then copy high index in low index and double the high index. 
-> if it is smaller, then apply binary search on high and low indices found. 
 */

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        // first find the range
        // start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previousEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // here's a problem as it might be possible that
            // (start + end) exceeds the range of int in Java

            int mid = start + (end - start) / 2; // better way to find mid
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
