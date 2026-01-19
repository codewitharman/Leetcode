class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() == 2 || set.size() == 1) {
            int last = ((TreeSet<Integer>) set).last();
            return last;
        }
        List<Integer> list = new ArrayList<>(set);
        if (list.size() >= 3) {
            int thirdLast = list.get(list.size() - 3);
            return thirdLast;
        }

        return 0;

    }
}