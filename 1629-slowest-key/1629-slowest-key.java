class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < keysPressed.length(); i++) {
            char ch = keysPressed.charAt(i);
            int duration = (i == 0) ? releaseTimes[0]
                    : releaseTimes[i] - releaseTimes[i - 1];
            map.put(ch, Math.max(map.getOrDefault(ch, 0), duration));
        }

        int max = 0;
        char key = '\u0000';
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > max || (e.getValue() == max && e.getKey() > key)) {
                max = e.getValue();
                key = e.getKey();
            }
        }
        return key;
    }
}