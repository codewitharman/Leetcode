class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            int current = nums[i];
            int next = nums[i + 1];

            if (current == next) {
                continue;
            } else if (current + 1 == next) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}