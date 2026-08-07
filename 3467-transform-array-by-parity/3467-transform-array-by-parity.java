class Solution {
    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index++] = 0;
            } else {
                result[index++] = 1;
            }
        }
        Arrays.sort(result);
        return result;
    }
}