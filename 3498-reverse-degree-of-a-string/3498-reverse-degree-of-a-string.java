class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char alpha = 'a';
        for (int i = 26; i >= 1; i--) {
            map.put(alpha++, i);
        }
        int index = 0;
        int sum = 0;
        int i = 0;

        while (index < s.length()) {
            char c = s.charAt(index++);
            if (map.containsKey(c)) {
                sum = sum + (map.get(c) * ++i);
            }
        }

        return sum;

    }
}