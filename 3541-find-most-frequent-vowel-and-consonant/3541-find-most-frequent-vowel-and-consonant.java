class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        int vowelMax = 0, consonantMax = 0;
        for (int i = 0; i < freq.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                if (freq[i] > vowelMax) 
                    vowelMax = freq[i];             
            } else {
                if (freq[i] > consonantMax) 
                    consonantMax = freq[i];            
            }
        }
        return consonantMax + vowelMax;
    }
}