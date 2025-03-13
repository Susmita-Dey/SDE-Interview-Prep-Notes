/* Question: Unique Paths
 * A robot starts at (0,0) in an m*n grid and can only move right or down. Find the number of unique paths to (m-1,n-1).
 * Input:
 * Two integers m an d n (1<=m, n<=100).
 * Output:
 * An integer representing the total unique paths.
 * Example 1:
 * 3 7
 * Output: 28
 * Example 2:
 * 4 3
 * Output: 10
 */

import java.util.Scanner;

public class UniquePaths {
    public static int findPaths(int row, int col, int m, int n, int[][] dp) {
        if (row >= m || col >= n || row < 0 || col < 0) {
            return 0;
        }
        if (row == m - 1 && col == n - 1) {
            return 1;
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int down = findPaths(row + 1, col, m, n, dp);
        int right = findPaths(row, col + 1, m, n, dp);
        return dp[row][col] = down + right;
    }

    public static int noOfUniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return findPaths(0, 0, m, n, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int spaceIndex = input.lastIndexOf(' ');
        int m = Integer.parseInt(input.substring(0, spaceIndex));
        int n = Integer.parseInt(input.substring(spaceIndex + 1));

        System.out.println(noOfUniquePaths(m, n));

        sc.close();
    }
}
