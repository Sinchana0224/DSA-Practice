/*
🧮 Problem: Make Matrix Beautiful
Difficulty: Medium
Source: GFG

A beautiful matrix is defined as a square matrix in which the sum of elements in every row and every column is equal. 
Given a square matrix `mat[][]`, your task is to determine the **minimum number of operations** required to make the matrix beautiful.

In one operation, you are allowed to **increment the value of any single cell by 1**.

-----------------------------------
Examples:

Input: 
mat = [[1, 2], 
       [3, 4]]
Output: 4

Explanation:
Increment value of cell(0, 0) by 3, 
Increment value of cell(0, 1) by 1. 
Matrix after the operations:
[[4, 3], 
 [3, 4]]
Here, sum of each row and column is 7.
Hence total 4 operation are required.

Input: 
mat = [[1, 2, 3],
       [4, 2, 3],
       [3, 2, 1]]
Output: 6

Explanation: 
Increment value of cell(0, 0) by 1, 
Increment value of cell(0, 1) by 2, 
Increment value of cell(2, 1) by 1, 
Increment value of cell(2, 2) by 2. 
Matrix after the operations:
[[2, 4, 3], 
 [4, 2, 3],
 [3, 3, 3]] 
Each row and column sum is 9.
Hence 6 operations are required.

-----------------------------------
Constraints:
1 ≤ mat.length ≤ 900
0 ≤ mat[i][j] ≤ 10^6
*/

public class MakeMatrixBeautiful {
    public static int balanceSums(int[][] mat) {
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        // Step 1: Compute row and column sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Step 2: Determine the target sum (maximum among row/column sums)
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Step 3: Total operations needed = sum of (maxSum - rowSum[i]) for each row
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += (maxSum - rowSum[i]);
        }

        return operations;
    }

    // Sample usage (optional for testing)
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Minimum operations: " + balanceSums(mat1)); // Output: 4

        int[][] mat2 = {
            {1, 2, 3},
            {4, 2, 3},
            {3, 2, 1}
        };
        System.out.println("Minimum operations: " + balanceSums(mat2)); // Output: 6
    }
}
