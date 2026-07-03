class Solution {
    public String replaceDigits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(i % 2 == 0 ? ch : (char) (str.charAt(i - 1) + ch - '0'));
        }
        return sb.toString();
    }
}