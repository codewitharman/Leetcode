class Solution {
    public int minimumSum(int num) {
        int[] nums = String.valueOf(num).chars().map(c -> c - '0').sorted().toArray();
        return ((nums[0] * 10) + nums[3]) + ((nums[1] * 10) + nums[2]);
    }
}