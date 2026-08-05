import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : nums1) {

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                int value = entry.getKey();
                int freq = entry.getValue();

                if (num % (value * k) == 0) {
                    count += freq;
                }
            }
        }

        return count;
    }
}