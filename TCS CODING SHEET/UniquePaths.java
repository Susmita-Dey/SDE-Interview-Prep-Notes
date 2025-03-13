/* Question: Unique Paths
 * A robot starts at (0,0) in an m*n grid and can only move right or down. Find the number of unique paths to (m-1,n-1).
 * Input:
 * Two integers m an d n (1<=m, n<=100).
 * Output:
 * An integer representing the total unique paths.
 * Example 1:
 * 3 7
 * Output: 8
 * Example 2:
 * 4 3
 * Output: 10
 */

import java.util.Scanner;

public class UniquePaths {
    public static int noOfUniquePaths(int row, int col, int m, int n) {
        if (row >= m || col >= n || row < 0 || col < 0) {
            return 0;
        } else if (row == m - 1 && col == n - 1) {
            return 1;
        }

        int down = noOfUniquePaths(row + 1, col, m, n);
        int right = noOfUniquePaths(row, col + 1, m, n);
        return down + right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(noOfUniquePaths(0, 0, m, n));

        sc.close();
    }
}
