class Solution {
    public int totalMoney(int n) {

        int sum = 0;
        int weekStart = 1;
        int current = weekStart;
        for (int i = 1; i <= n; i++) {
            sum = sum + current;
            current++;
            if (i % 7 == 0) {
                weekStart++;
                current = weekStart;
            }
        }

        return sum;
    }
}