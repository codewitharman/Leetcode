class Solution {
    public int[] sortByBits(int[] arr) {
        int result[] = new int[arr.length];
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int num : arr) {
            int bit = Integer.bitCount(num);
            map.computeIfAbsent(bit, k -> new ArrayList<>()).add(num);
        }
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            List<Integer> list = e.getValue(); //[1, 2, 4, 8] 
            Collections.sort(list);
            for (int num : list) {
                result[index++] = num;
            }
        }

        return result;
    }
}