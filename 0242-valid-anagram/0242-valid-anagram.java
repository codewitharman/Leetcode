class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1); //remove frquency 1 by 1
            if (map.get(ch) == 0) {
                map.remove(ch); //once its 0 then remove that element too
            }
        }

        return map.isEmpty();
    }
}