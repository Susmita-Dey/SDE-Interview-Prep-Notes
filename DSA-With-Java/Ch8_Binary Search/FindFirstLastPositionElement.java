public class FindFirstLastPositionElement {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        // ans[0] = findFirstOccurence(nums, target);
        // ans[1] = findLastOccurence(nums, target);

        int startValue = search(nums, target, true);
        int endValue = search(nums, target, false);

        ans[0] = startValue;
        ans[1] = endValue;

        return ans;
    }

    // binarySearch method
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // here's a problem as it might be possible that
            // (start + end) exceeds the range of int in Java

            int mid = start + (end - start) / 2; // better way to find mid
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static int findFirstOccurence(int[] array, int target) {
        // Brute force solution - Time Complexity: O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastOccurence(int[] array, int target) {
        // Brute force solution - Time Complexity: O(n)
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
