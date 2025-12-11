class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();

            while (freq-- > 0) {
                nums[index++] = value;
            }
        }
    }
}