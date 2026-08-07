class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index--] = 1;
            }
        }
        return result;
    }
}