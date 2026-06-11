class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        //System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().strip();

    }
}