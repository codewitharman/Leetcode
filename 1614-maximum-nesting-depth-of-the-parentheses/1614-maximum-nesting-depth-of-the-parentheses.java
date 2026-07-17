class Solution {
    public int maxDepth(String s) {
        int size = 0, max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                size++;
            if (ch == ')')
                size--;
            if (size > max)
                max = size;
        }
        return max;
    }
}