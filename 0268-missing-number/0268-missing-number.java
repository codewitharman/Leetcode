class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        for (int i = 0; i <= n; i++) {
            totalSum += i;
        }

        return totalSum - sum;
    }
}
