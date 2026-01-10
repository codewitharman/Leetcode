class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int nums[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';
            nums[index] = nums[index] + 1;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int index = ch - 'a';
            nums[index] = nums[index] - 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}