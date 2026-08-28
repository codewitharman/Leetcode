class Solution {
    public boolean canAliceWin(int[] nums) {
        int sSum = 0;
        int dSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10)
                sSum += nums[i];
            else
                dSum += nums[i];

        }
        return sSum > dSum || sSum < dSum;

    }
}