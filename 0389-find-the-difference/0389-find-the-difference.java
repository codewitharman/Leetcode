class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        for (char ch : t.toCharArray())
            freq[ch - 'a']++;

        for (char ch : s.toCharArray())
            freq[ch - 'a']--;

        int index = 0;
        for (int num : freq) {
            if (num == 1) {
                char ch = (char) (index + 'a');
                return ch;
            }
            index++;
        }
        return ' ';
    }
}