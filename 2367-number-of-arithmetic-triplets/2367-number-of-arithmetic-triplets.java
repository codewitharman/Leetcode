class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            boolean hasLower = false, hasUpper = false;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == nums[j] - diff) hasLower = true;
                if (nums[k] == nums[j] + diff) hasUpper = true;
            }
            if (hasLower && hasUpper) count++;
        }
        return count;
    }
}