class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        long secondMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        long thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != secondMax && nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }

        return (thirdMax == Long.MIN_VALUE) ? (int) max : (int) thirdMax;
    }
}
