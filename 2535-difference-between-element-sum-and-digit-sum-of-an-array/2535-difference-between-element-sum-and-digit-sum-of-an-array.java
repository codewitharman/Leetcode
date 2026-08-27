class Solution {
    public int differenceOfSum(int[] nums) {
        int arraySum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp > 0) {
                int digit = temp % 10;
                digitSum += digit;
                temp = temp / 10;
            }
        }
        return arraySum - digitSum;
    }
}