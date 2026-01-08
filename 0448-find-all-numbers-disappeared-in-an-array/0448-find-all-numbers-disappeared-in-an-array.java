class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] flagArr = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            flagArr[nums[i]] = true;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < flagArr.length; i++) {
            if (flagArr[i] == false) {
                list.add(i);
            }
        }
        return list;
    }
}