////////////////////////////////brute force//////////////////////////////////
TC: m*n*m*m
  =m^2*n^2

  class Solution {
    public int countSubmatrices(int[][] grid, int k) {
       int m = grid.length;
       int n = grid[0].length;
       int cnt=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            int sum =0;
            for(int r=0;r<=i;r++){
                for(int c=0;c<=j;c++){
                    sum += grid[r][c];
                }
            }
            if(sum <= k){
                cnt++;
            }
         }
       }
       return cnt;
    }
}

//////////////////////////////////////////optimal solution using PREFIX SUM///////////////////////////////////

//Approach-2 (Using precomputed results)
//T.C : O(m*n)
//S.C : O(1)
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i > 0) 
                  grid[i][j] += grid[i - 1][j];
                if (j > 0) 
                  grid[i][j] += grid[i][j - 1];
                if (i > 0 && j > 0) 
                  grid[i][j] -= grid[i - 1][j - 1];

                if (grid[i][j] <= k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
