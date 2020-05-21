/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.


Example 1:

Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]

Output: 15
Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.


Example 2:

Input: matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]

Output: 7
Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.

*/

class Solution {
    public int countSquares(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int [][] dp = new int[n+1][m+1];
        int total = 0;
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(matrix[i-1][j-1]==1)
                {
                    dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1])) + 1;
                }
                total+=dp[i][j];
            }
        }
        
        /*
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        */
        
        return total;
    }
}
