class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] xArr = new int[nums.length / 2];
        int[] yArr = new int[nums.length / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            xArr[index++] = nums[i];
        }
        index = 0;
        for (int i = n; i < nums.length; i++) {
            yArr[index++] = nums[i];
        }

        int result[] = new int[nums.length];

        for (int i = 0; i < xArr.length; i++) {
            result[i * 2] = xArr[i];
        }

        for (int i = 0; i < xArr.length; i++) {
            result[i * 2 + 1] = yArr[i];
        }

        return result;
    }
}