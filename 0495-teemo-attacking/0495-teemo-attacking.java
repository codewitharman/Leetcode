class Solution {
    public int findPoisonedDuration(int[] nums, int duration) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int t = nums[i]; t < nums[i] + duration; t++) {
                if (i < nums.length - 1 && t >= nums[i + 1]) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}