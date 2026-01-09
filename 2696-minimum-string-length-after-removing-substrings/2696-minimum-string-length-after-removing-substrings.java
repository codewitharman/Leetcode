class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() > 0 && ch == 'B') {
                if (sb.charAt(sb.length() - 1) == 'A') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            } else if (sb.length() > 0 && ch == 'D') {
                if (sb.charAt(sb.length() - 1) == 'C') {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.length();
    }
}