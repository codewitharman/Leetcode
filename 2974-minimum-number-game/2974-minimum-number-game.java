class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int result[] = new int[nums.length];
        int index = 0;
        for (int i = 1; i < nums.length; i = i + 2) {
            result[index++] = nums[i];
            result[index++] = nums[i - 1];
        }
        return result;

    }
}