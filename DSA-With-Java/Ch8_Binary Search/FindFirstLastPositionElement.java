public class FindFirstLastPositionElement {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = findFirstOccurence(nums, target);
        ans[1] = findLastOccurence(nums, target);
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
