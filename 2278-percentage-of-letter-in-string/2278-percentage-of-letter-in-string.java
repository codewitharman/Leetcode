class Solution {
    public int percentageLetter(String s, char letter) {
        if (s.indexOf(letter) == -1) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int occurrence = 0;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == letter) {
                occurrence = entry.getValue();
            }
        }
        return (occurrence * 100) / s.length();

    }
}