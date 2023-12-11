/* Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:

Input: arr = [1,1]
Output: 1

Link to the question: https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
*/

public class ElementAppearingMoreThan25Percent {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        int ans = findSpecialInteger(arr);
        System.out.println(ans);
    }

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 1;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > n / 4) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
}