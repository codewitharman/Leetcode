class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []temp = new int[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            temp[j] = nums[i] * nums[i];
            j++;
        }

        Arrays.sort(temp);
        return temp;
    }
}