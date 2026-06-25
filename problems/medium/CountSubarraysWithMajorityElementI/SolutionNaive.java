import java.util.Arrays;

class SolutionNaive {
    public int countMajoritySubarrays(int[] nums, int target) {
        
   /* create a mask
    *    int[] numsMask = new int[nums.length];
    *
    *    for (int i=0; i<nums.length; i++) {
    *        if (nums[i] == target) {
    *            numsMask[i] = 1;
    *        } else {
    *            numsMask[i] = -1;
    *        }
    *    }
    *
    * create a prefix sum from the mask
    *    int[] prefixSum = new int[nums.length + 1];
    *
    *    for (int i=0; i<nums.length; i++) {
    *        prefixSum[i + 1] = prefixSum[i] + numsMask[i];
    *    }
    */

        // Simplified prefix sum array construction.
        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int value = nums[i] == target ? 1 : -1;
            prefixSum[i + 1] = prefixSum[i] + value;
        }

        int result = 0;

        // calculate subarray sum.
        for (int right = 1; right < prefixSum.length; right++) {
            for (int left = 0; left < right; left++) {
                if (prefixSum[right] > prefixSum[left]) {
                    result++;
                }
            }
        }
        return result;
    }
}
