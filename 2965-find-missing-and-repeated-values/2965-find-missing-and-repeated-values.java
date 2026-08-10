class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        int result[] = new int[2];
        int total = grid.length * grid.length;
        int expectedSum = total * (total + 1) / 2;
        int actualSum = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 2) {
                result[0] = e.getKey();
            }
            actualSum += e.getKey();
        }

        result[1] = expectedSum - actualSum;
        return result;
    }
}