/*
 * Question: https://leetcode.com/problems/find-in-mountain-array
 */

public class FindEleMountainArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;

        int[] arr = { 0, 1, 2, 4, 2, 1 };

        int ans = findElement(array, target);
        System.out.println(ans);
    }

    public static int findElement(int[] array, int target) {
        int peak = findPeakIndex(array);
        int firstTry = orderAgnosticBS(array, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // try to search in second hald
        return orderAgnosticBS(array, target, peak + 1, array.length - 1);
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) exceeds
            // the range of int in Java

            int mid = start + (end - start) / 2; // better way to find mid

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
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
