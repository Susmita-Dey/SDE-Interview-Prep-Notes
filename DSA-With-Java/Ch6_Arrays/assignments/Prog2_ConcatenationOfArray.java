package assignments;

public class Prog2_ConcatenationOfArray {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1 };
        int[] ans = getConcatenation(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        // O(n) way of solving the problem
        // for (int i = 0; i < nums.length; i++) {
        // ans[i] = nums[i];
        // ans[i + nums.length] = nums[i];
        // }

        return ans;
    }
}
