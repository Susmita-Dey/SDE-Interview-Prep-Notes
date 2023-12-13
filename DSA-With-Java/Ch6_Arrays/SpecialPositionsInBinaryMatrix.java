/*
 * Given an mxn binary matrix mat, return the number of special positions in mat.
 * A position (i,j) is called special if mat[i][j]==1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
 * 
 * Example:
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1,2) is a special position because mat[1][2]==1 and all other elements in row 1 and column 2 are 0.
 * 
 * Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * Explanation: (0,0),(1,1) and (2,2) are special positions because mat[0][0]==1 and all other elements in row 0 and column 0 are 0 and same goes for other ones.
 */

public class SpecialPositionsInBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0 },
                { 0, 0, 1 },
                { 1, 0, 0 }
        };
        int[][] matrix = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };
        int[][] matrix1 = {
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 1, 0, 0 }
        };
        int ans = specialPositionCount(matrix1);
        System.out.println(ans);
    }

    public static int specialPositionCount(int[][] mat) {
        int count = 0;
        int[] rowSums = new int[mat.length];
        int[] colSums = new int[mat[0].length];

        // Calculate row sums
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                rowSums[i] += mat[i][j];
            }
        }

        // Calculate column sums
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                colSums[j] += mat[i][j];
            }
        }

        // Check each cell if it's a special position
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && rowSums[i] == 1 && colSums[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    /*
    public boolean checkCol(int[][] mat, int col) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] == 1) {
                count++;
            }
        }
        return count == 1;
    }

    public boolean checkRow(int[][] mat, int row) {
        int count = 0;
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[row][i] == 1) {
                count++;
            }
        }
        return count == 1;
    }
     */
}
