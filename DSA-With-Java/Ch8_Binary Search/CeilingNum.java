/* Question:
 * Let arr = [2,3,5,9,14,16,18]
 * Ceiling = smallest element in array greater or = target
 * Example:
 * ceiling(arr,target=14) = 14
 * ceiling(arr,target=15) = 16 [since, number greater than 15 in the array but smallest num among the remaining elements in the array]
 * ceiling(arr,target=4) = 5
 * ceiling(arr,target=9) = 9
 */

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        int ans = findCeiling(arr, target);
        System.out.println("Ceiling number = " + ans);
    }

    public static int findCeiling(int[] nums, int target) {
        // find ceiling number

        int start = 0;
        int end = nums.length - 1;

        if (target > nums[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else { // target == nums[mid]
                return nums[mid];
            }
        }

        return nums[start];
    }
}
