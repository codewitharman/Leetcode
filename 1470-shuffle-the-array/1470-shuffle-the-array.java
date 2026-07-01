class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[n * 2];
        int index = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            result[index] = nums[i];
            result[index + 1] = nums[i + n];
            index = index + 2;
        }

        return result;

    }
}