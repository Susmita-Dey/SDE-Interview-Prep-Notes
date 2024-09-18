/*
 * An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1
 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
 */

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
        int[] num = { 0, 2, 1, 0 };
        int ans = findPeakIndex(arr);
        System.out.println("Peak index = " + ans);
    }

    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part of the array
                // this ay be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }

        // in the end, start == end and pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one
        // because that is what the checks say
        // more eleboration: at every point of time for start and end, they have the
        // possible answer till that time
        // and if we are saying that only item is remaining, hence because of above line
        // that is the best possible answer.
        return start;
    }
}
