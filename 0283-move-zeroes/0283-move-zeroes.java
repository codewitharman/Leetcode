class Solution {
    public void moveZeroes(int[] nums) {
        int result[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        System.arraycopy(result, 0, nums, 0, result.length);

    }

}