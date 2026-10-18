
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int current = s.charAt(i) - '0';
            int next = s.charAt(i + 1) - '0';
            int result = Math.abs(current - next);
            if (result > 2) {
                return false;
            }
        }
        return true;
    }
}
