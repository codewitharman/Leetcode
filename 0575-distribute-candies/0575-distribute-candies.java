class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int limit = n / 2;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(candyType[i]);
        }

        for (int candy : set) {
            count++;
            if (count == limit) {
                return count;
            }
        }

        return count;
    }
}