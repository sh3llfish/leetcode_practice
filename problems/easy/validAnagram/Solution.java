class Solution {
    public boolean isAnagram(String s, String t) {
        // early exit if length are not equal
        if (s.length() != t.length()) {
            return false;
        }

        // s and t are consist of lowercase English characters.
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            // calculate index by subtracting chars'ascii code.
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;

            // if t does not have enough character to recontruct t.
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
