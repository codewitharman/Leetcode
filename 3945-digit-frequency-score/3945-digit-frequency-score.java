class Solution {
    public int digitFrequencyScore(int n) {
        String str = String.valueOf(n);
        Map<Integer, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            int num = (int) ch - '0';
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) 
            sum = sum + e.getKey() * e.getValue();
        
        return sum;
    }
}