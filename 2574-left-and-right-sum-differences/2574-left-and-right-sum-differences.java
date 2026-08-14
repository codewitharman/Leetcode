class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int left[] = new int[nums.length];
        left[0] = 0;
        int right[] = new int[nums.length];
        right[nums.length - 1] = 0;
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            left[index] = nums[i] + left[index - 1]; //10+
            index++;
        }
        index = right.length - 2;
        for (int i = nums.length - 1; i >= 1; i--) {
            right[index] = nums[i] + right[index + 1];
            index--;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.abs(right[i] - left[i]);
        }
        return result;

    }
}