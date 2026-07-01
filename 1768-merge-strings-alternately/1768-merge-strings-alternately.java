class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int k = 0;

        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < min; i++) {
            result[k++] = word1.charAt(i);
            result[k++] = word2.charAt(i);
        }

        for (int i = min; i < word1.length(); i++)
            result[k++] = word1.charAt(i);
        for (int i = min; i < word2.length(); i++)
            result[k++] = word2.charAt(i);

        return String.valueOf(result);
    }
}