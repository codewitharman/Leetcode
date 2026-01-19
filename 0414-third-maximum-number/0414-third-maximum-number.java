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
        int[] intArray = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            intArray[index++] = num;
        }

        if (intArray.length > 2) {
            return intArray[intArray.length - 3];
        }

        return 0;

    }
}