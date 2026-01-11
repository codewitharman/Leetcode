class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if (s.length() == 0)
            return count;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        } 
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;

    }
}