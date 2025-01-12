import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> dict = new HashMap<>();

        int len = nums.length;
        int targ;

        for(int i = 0; i < len; i++ ) {
            targ = target - nums[i];
            if (dict.containsKey(targ)) {
                return new int[] {i, dict.get(targ)};
            } else {
                dict.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}