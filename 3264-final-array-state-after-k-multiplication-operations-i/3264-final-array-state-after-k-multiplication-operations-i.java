class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int index = 0;
        while (index < k) {
            int min = Integer.MAX_VALUE;
            int smallestIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    smallestIndex = i;
                }
            }
            nums[smallestIndex] = nums[smallestIndex] * multiplier;
            index++;
        }

        return nums;
    }
}