// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.



// O(nlog(n)) sort dominates
// import java.util.Arrays;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i=0; i<nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // GeneralInterface<VariableType> variableName = new ActualConstructor();
        Set<Integer> seen = new HashSet<>();
        
        // O(n)
        for (int i=0; i<nums.length; i++) {
            // Average O(1) for HashSet.contains()
            if (seen.contains(nums[i])) {
                return true;
            }
            // Average O(1)
            seen.add(nums[i]);
        }
        return false;
    }
}
