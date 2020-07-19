import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        

        for(int i=0; i<nums.length; i++){

            int other = target - nums[i];
            Integer otherIndex = map.get(other);
            if(otherIndex!= null && otherIndex != i) {
                return new int[]{i, otherIndex};
            }
        }

        return new int[0];
    }
}
// @lc code=end

