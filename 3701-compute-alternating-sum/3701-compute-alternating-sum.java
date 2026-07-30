class Solution {
    public int alternatingSum(int[] nums) {
        int addSum=0;
        for(int i=0;i<nums.length;i+=2){
            addSum+=nums[i];
        }
        int subSum=0;
        for(int i=1;i<nums.length;i+=2){
            subSum+=nums[i];
        }
        return addSum-subSum;
    }
}