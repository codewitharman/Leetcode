class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] freq = new char[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                return false;
            }
        }

        return true;
    }
}