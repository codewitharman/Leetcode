import java.util.*;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : moves.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);   // count '_' as well
        }

        int l = map.getOrDefault('L', 0);
        int r = map.getOrDefault('R', 0);
        int x = map.getOrDefault('_', 0);

        return Math.abs(l - r) + x;
    }
}