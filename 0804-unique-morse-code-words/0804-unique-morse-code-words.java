class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        char ch = 'a';
        Map<Character, String> map = new HashMap<>(26);
        for (String str : arr) {
            map.put(ch++, str);
        }

        Set<String> set=new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String str = map.get(c);
                sb = sb.append(str);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}