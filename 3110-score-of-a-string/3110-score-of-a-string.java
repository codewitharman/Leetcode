class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = s.charAt(i);
            int next = s.charAt(i + 1);
            //System.out.println(current+"-"+next);
            int score = current - next;
            if (score < 0) {
                score = Math.abs(score);
            }
            //System.out.println(score);
            sum = sum + score;
        }
        return sum;
    }
}