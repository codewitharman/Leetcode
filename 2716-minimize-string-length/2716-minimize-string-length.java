class Solution {
    public int minimizedStringLength(String s) {
        int[] freq = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        return count;
    }
}