class Solution {
    public int differenceOfSum(int[] nums) {
        int arraySum = 0;
        int digitSum = 0;
        for (int num : nums) {
            arraySum += num;
            while (num > 0) {
                int digit = num % 10;
                digitSum += digit;
                num = num / 10;
            }
        }
        return arraySum - digitSum;
    }
}