class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && ((ch == 'B' && sb.charAt(n - 1) == 'A') || (ch == 'D' && sb.charAt(n - 1) == 'C'))) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.length();
    }
}
