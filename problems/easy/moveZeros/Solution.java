class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;

        // Move all non-zero elements to the front
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        // Fill the remaining positions with 0
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}
