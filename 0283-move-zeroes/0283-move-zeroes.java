class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
        int index = 0;
        for (int num : list) {
            nums[index++] = num;
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}