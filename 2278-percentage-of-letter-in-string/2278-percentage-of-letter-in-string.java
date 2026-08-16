import java.util.*;

class Solution {
    public int percentageLetter(String s, char letter) {
        if (s.indexOf(letter) == -1) {
            return 0;
        }
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int occurrence = 0;
        for (int i = 0; i < freq.length; i++) {
            char ch = (char) (i + 97);
            if (ch == letter) {
                occurrence = freq[i];
            }
        }
        return occurrence * 100 / s.length();

    }
}