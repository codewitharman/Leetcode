class Solution {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            int count = nums[i];
            while (count > 0) {
                list.add(nums[i + 1]);
                count--;
            }
        }
        int index = 0;
        int[] result = new int[list.size()];
        for (int num : list) {
            result[index++] = num;
        }

        return result;
    }
}