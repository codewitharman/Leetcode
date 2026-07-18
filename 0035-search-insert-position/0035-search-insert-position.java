class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num < target) {
                count++;
            }
        }

        return count;
    }
}