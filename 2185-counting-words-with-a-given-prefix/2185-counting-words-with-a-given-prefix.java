class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.contains(pref) && word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}