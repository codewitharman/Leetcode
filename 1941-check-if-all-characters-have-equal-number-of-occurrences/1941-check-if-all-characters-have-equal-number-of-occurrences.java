class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int x = freq[s.charAt(0) - 'a'];

        //System.out.println(x);
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0)
                continue;
            if (freq[i] != x)
                return false;
        }

        return true;
    }
}