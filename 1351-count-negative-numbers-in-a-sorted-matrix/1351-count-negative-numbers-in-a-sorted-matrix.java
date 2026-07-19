class Solution {
    public int countNegatives(int[][] grid) {
        int arr[] = Arrays.stream(grid).flatMapToInt(Arrays::stream).toArray();
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }

        return count;
    }
}