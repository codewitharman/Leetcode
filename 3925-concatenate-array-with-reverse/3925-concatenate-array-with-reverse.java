class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length, index = 0;
        int[] result = new int[n * 2];
        for (int i = 0; i < n; i++) 
            result[index++] = nums[i];
        

        for (int i = n - 1; i >= 0; i--) 
            result[index++] = nums[i];
        

        return result;
    }
}