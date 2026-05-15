class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();

        Map<Character, Integer> firstWordFreq = new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            firstWordFreq.put(ch, firstWordFreq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>();
            String word = words[i];
            for (char ch : word.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }

            for (char ch : new HashSet<>(firstWordFreq.keySet())) {
                if (temp.containsKey(ch)) {
                    firstWordFreq.put(ch, Math.min(firstWordFreq.get(ch), temp.get(ch)));
                } else {
                    firstWordFreq.remove(ch);
                }
            }
        }

        for (char ch : firstWordFreq.keySet()) {
            int freq = firstWordFreq.get(ch);
            while (freq > 0) {
                list.add(String.valueOf(ch));
                freq--;
            }
        }

        return list;
    }
}