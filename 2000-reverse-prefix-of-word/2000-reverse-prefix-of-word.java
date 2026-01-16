class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String res = "";
        for (int i = 0; i <= index; i++) {
            res = word.charAt(i) + res;
        }
        return res + word.substring(index + 1, word.length());
    }

}