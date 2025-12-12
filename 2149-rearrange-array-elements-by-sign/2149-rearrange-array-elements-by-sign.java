class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int j = 0, k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg[k++] = nums[i];
            } else {
                pos[j++] = nums[i];
            }
        }

        j = 0;k = 0;

        for (int i = 0; i < n; i += 2) {
            nums[i] = pos[j++];
            nums[i + 1] = neg[k++];
        }

        return nums;
    }
}
