/*
 * Given a sorted array and a target value, return the floor of the target.
 * Floor of the target = largest element in the array smaller than or equal to the target
 */

public class FloorNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans = findFloor(arr, target);
        System.out.println("Floor number = " + ans);
    }

    public static int findFloor(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        if (target < nums[start]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return nums[mid];
            }
        }

        return nums[end];
    }
}
