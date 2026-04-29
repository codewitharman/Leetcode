class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++; //'a'-'a' //98-98=0
            freq[t.charAt(i)-'a']--;
        }
        for(int num:freq){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}