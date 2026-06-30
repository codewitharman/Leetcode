class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int n = nums.length / 2;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == n) {
                return e.getKey();
            }
        }

        return -1;

    }
}