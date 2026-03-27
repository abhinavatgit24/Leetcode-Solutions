class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int row = 0, col = n - 1; // start from top-right

        while (row < m && col >= 0) {
            int val = matrix[row][col];

            if (val == target) {
                return true;
            } 
            else if (val > target) {
                col--; // move left
            } 
            else {
                row++; // move down
            }
        }

        return false;
    }
}