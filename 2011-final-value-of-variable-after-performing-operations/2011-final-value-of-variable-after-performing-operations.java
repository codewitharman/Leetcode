class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String str : operations) {
            if (str.equals("++X") || str.equals("X++")) {
                sum = sum + 1;
            } else {
                sum = sum - 1;
            }
        }
        return sum;
    }
}