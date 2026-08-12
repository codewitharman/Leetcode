class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (char str : s.toCharArray()) {
            set.add(str);
        }

        return set.size();
    }
}