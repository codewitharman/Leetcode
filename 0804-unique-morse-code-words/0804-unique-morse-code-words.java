class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        Set<String> set=new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                String str = arr[c-'a'];
                sb = sb.append(str);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}