class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxSum = sum > maxSum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }

        return maxSum;
    }
}