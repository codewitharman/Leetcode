class Solution {
    public int maxDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) { //a //b //a //b
                map.put(ch, map.get(ch) + 1);
            } else {                    //{a,2} {b,2}
                map.put(ch, 1);
            }
        }
        return map.size();

    }
}