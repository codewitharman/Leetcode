class Solution {
    public int commonFactors(int a, int b) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 2) {
                count++;
            }
        }

        return count;
    }
}