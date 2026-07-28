class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result[] = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 2) {
                result[index++] = e.getKey();
            }
        }
        return result;

    }
}