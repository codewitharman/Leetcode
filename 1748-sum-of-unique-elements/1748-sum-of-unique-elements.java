class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        //System.out.println(Arrays.toString(freq));
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}