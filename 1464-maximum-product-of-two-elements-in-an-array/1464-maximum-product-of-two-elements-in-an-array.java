class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums); //[2,3,4,5]


        System.out.println(nums[nums.length-2]);
        int prod = (nums[nums.length-1] - 1) * (nums[nums.length - 2] - 1);
        return prod;
    }
}