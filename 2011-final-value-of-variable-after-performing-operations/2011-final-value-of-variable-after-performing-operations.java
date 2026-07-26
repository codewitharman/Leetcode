class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if (str.equals("++X") || str.equals("X++")) {
                sum = sum + 1;
            } else if (str.equals("--X") || str.equals("X--")) {
                sum = sum - 1;
            }
        }
        return sum;
    }
}