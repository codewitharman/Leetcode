class Solution {
    public int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            index = 0;
            while (index <= i) {
                sum = sum + nums[index];
                index++;
            }
            result[i] = sum;
        }

        return result;
    }
}