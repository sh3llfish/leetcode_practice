import java.util.Arrays;

class Fenwick {
    private int[] tree;

    public Fenwick(int size) {
        tree = new int[size + 1];
    }

    public void add(int index, int delta) {
        while (index < tree.length) {
            tree[index] += delta;
            index += index & -index;
        }
    }

    public int sum(int index) {
        int result = 0;

        while (index > 0) {
            result += tree[index];
            index -= index & -index;
        }
        return result;        
    }
}

class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;
        Fenwick bit = new Fenwick(2 * n + 3);

        int offset = n + 1;
        int prefix = 0;
        int answer = 0;

        // initial prefix sum before array starts.
        bit.add(prefix + offset, 1);

        for (int num : nums) {
            prefix += (num == target) ? 1 : -1;

            // count previous prefix sums strictly smaller than current prefix
            answer += bit.sum(prefix + offset - 1);

            // record current prefix sum.
            bit.add(prefix + offset, 1);
        }
        return answer;
    }
}
