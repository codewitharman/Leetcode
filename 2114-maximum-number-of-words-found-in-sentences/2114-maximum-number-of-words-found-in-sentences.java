class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for (String str : s) {
            int count = 1;
            for (char ch : str.toCharArray()) {
                if (ch == ' ') {
                    count++;
                }
            }

            max = Math.max(max, count);

        }

        return max;
    }
}