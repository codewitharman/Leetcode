class Solution {
    public int countNegatives(int[][] grid) {
        int[] nums = Arrays.stream(grid)
                           .flatMapToInt(Arrays::stream)
                           .toArray();

        int count = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] < 0) {
                count++;
            }

            if (nums[end] < 0) {
                count++;
            }

            start++;
            end--;
        }

        if (start == end && nums[start] < 0) {
            count++;
        }

        return count;
    }
}