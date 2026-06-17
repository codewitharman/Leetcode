class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            count = count + freq * (freq - 1) / 2;
        }

        return count;
    }
}