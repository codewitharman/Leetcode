class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        return Stream.of(matrix).flatMapToInt(row -> java.util.Arrays.stream(row)).anyMatch(num -> num == target);

    }
}