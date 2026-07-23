class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            String[] temp = s.split("\\s+");
            int count = 0;

            for (String str : temp) {
                count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}