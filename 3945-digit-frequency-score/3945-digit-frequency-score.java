class Solution {
    public int digitFrequencyScore(int n) {
        List<Integer> list = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            list.add(digit);
            temp = temp / 10;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            sum = sum + e.getKey() * e.getValue();
        }
        return sum;
    }
}