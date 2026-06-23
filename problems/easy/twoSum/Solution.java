/*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

    You can return the answer in any order.

    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Contruct a Hashmap to store checked value and its index.
        Map<Integer, Integer> seen = new HashMap<>();
        
        // Traverse whole array
        for (int i=0; i<nums.length; i++) {
            
            // calculate diffence between current value and target value.
            int diff = target - nums[i];

            // Check if difference is a checked value
            // if it is the sum of current value and that value is target.
            // return their index [seen.get(diff), i]
            if (seen.containsKey(diff)) {
                return new int[] {seen.get(diff), i};
            }

            // put current value and index into checked map.
            seen.put(nums[i], i);
        }

        return new int[] {};
    }
}
