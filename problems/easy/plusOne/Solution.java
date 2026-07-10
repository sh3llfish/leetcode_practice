class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int curr = digits.length - 1; curr >= 0; curr--) {
            if (digits[curr] < 9) {
                digits[curr]++;
                return digits;
            }

            digits[curr] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
