import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int duplicate = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[] { duplicate, missing };
    }
}