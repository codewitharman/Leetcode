class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        //System.out.println(rows);
        //System.out.println(cols);
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols; //index of row
            int col = mid % cols; //index of col  
            //System.out.println(row);
            //System.out.println(col);

            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (target > val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }
}