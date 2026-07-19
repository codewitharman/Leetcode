class Solution {
    public int countNegatives(int[][] grid) {
        int flatArray[] = Arrays.stream(grid).flatMapToInt(Arrays::stream).toArray();
        int count = 0;
        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] < 0) {
                count++;
            }
        }

        return count;
    }
}