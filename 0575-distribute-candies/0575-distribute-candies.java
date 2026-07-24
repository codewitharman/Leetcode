class Solution {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int candy : candyType) {
            map.put(candy, map.getOrDefault(candy, 0) + 1);
        }

        return Math.min(map.size(), candyType.length / 2);
    }
}