class Solution {
    public void reverseString(char[] s) {
        //Collections.reverse(Arrays.asList(s));
        int start = 0, end = s.length - 1;
        while (start < end) {
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
}