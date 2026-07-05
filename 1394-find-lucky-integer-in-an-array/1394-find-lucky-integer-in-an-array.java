class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
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