class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < 3) {
           return set.last();
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size() - 3);
    }
}