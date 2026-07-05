class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey().intValue() == e.getValue().intValue()) {
                if (e.getKey() > max) {
                    max = e.getKey();
                }
            }
        }

        return max;

    }
}