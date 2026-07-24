class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();

        for (int i = 0; i < rings.length(); i += 2) {
            char ring = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            map.computeIfAbsent(rod, k -> new HashSet<>()).add(ring);
        }
        int count = 0;

        for (Set<Character> colors : map.values()) {
            if (colors.size() == 3) {
                count++;
            }
        }
        return count;
    }
}