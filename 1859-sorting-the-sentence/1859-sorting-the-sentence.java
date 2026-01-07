class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            char lastChar = words[i].charAt(words[i].length() - 1);

            int pos = lastChar - '1';
            result[pos] = words[i].substring(0, words[i].length() - 1);

        }

        return String.join(" ", result);
    }
}