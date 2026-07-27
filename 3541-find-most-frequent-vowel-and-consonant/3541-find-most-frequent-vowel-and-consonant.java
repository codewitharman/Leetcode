class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int vowelMax = 0;
        int consonantMax = 0;
        for (int i = 0; i < freq.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
                //char ch=(char) (i+(int)'a');
                //System.out.println(ch+"-"+freq[i]);
                if (freq[i] > vowelMax) {
                    vowelMax = freq[i];
                }
            } else {
                if (freq[i] > consonantMax) {
                    consonantMax = freq[i];
                }
            }
        }
        return consonantMax + vowelMax;
        //System.out.println(vowelMax);

        // else {
        //         if (freq[i] > consonantMax) {
        //             consonantMax = freq[i];
        //         }
        //     }
        //System.out.println(consonantMax);
        //System.out.println(vowelMax);

    }
}