class Solution {
    public void duplicateZeros(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        int[] result = new int[nums.length];
        int index = 0;   
        int write = 0;   

        for (int i = 0; i < nums.length && write < nums.length; i++) {
            if (nums[i] != 0) {
                result[write++] = list.get(index++);
            } else {
                result[write++] = 0;
                if (write < nums.length) {   
                    result[write++] = 0;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}