class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = k - 1;
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }

        return sb.toString();
    }
}