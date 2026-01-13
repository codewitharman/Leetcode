class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, k)).reverse();
        sb.append(s.substring(k, s.length()));
        return sb.toString();
    }
}