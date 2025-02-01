/*
 * Leetcode question: https://leetcode.com/problems/special-array-i/
 * Difficulty level: Easy
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

import java.util.*;

class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }

        boolean special = false;
        for(int i = 0; i<nums.length-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2!=0)||(nums[i]%2!=0 && nums[i+1]%2==0)){
                special = true;
            } else{
                special = false;
                break;
            }
        }
        return special;
    }
}
