import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        // early exit if length are not equal
        if (s.codePointCount(0, s.length()) != t.codePointCount(0, t.length())) {
            return false;
        }

        // Use Integer instead of Character for s, t may contains Unicode.
        // as Java char is 16-bit but some Unicode Characters are represented by 2 chars.
        Map<Integer, Integer> count = new HashMap<>();

        s.codePoints().forEach(cp -> {
            count.put(cp, count.getOrDefault(cp, 0) + 1);
        });

        t.codePoints().forEach(cp -> {
            count.put(cp, count.getOrDefault(cp, 0) - 1);
        });

        for (int value : count.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
