class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String str : operations)
            sum = (str.equals("++X") || str.equals("X++")) ? sum + 1 : sum - 1;
        return sum;
    }
}