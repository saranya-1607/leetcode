class Solution {
    public int countNegatives(int[][] grid) {
        int m =grid.length;
        int n = grid[0].length;
        int r =0;
        int c =n-1;
        int cnt =0;
        while(r<m && c>=0){
            if(grid[r][c]<0){
                cnt += m-r;
                c--;
            }else{
                r++;
            }
        }
        
        return cnt;
    }
}
