class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if (s.length() == 0)
            return count;
        String str = s.trim();
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }

        return count;

    }
}