class Solution {
    public int digitFrequencyScore(int n) {
        String str = String.valueOf(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray())
            map.put((int) ch - '0', map.getOrDefault((int) ch - '0', 0) + 1);

        int sum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            sum = sum + e.getKey() * e.getValue();

        return sum;
    }
}