class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        int max = Math.max(s.length(), t.length());
        for (int i = 0; i < max; i++) {
            if (i < t.length())
                freq[t.charAt(i) - 'a']++;
            if (i < s.length())
                freq[s.charAt(i) - 'a']--;
        }

        int index = 0;
        for (int num : freq) {
            if (num == 1)
                return (char) (index + 'a');
            ++index;
        }
        return ' ';
    }
}