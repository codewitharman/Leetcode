class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix == null || matrix[0].length == 0) {
            return false;
        }

        int n = 0;
        for (int[] row : matrix) {
            n = n + row.length;
        }

        int[] arr = new int[n];
        int index = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                arr[index++] = element;
            }
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}