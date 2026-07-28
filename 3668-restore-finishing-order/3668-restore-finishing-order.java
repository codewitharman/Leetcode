class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }

        int result[] = new int[friends.length];
        int index = 0;
        for (int num : order) {
            if (set.contains(num)) {
                result[index++] = num;
            }
        }
        return result;
    }
}