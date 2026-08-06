class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String result = null;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String str = arr[c - 'a'];
                result += str;
            }
            set.add(result);
        }

        return set.size();
    }
}