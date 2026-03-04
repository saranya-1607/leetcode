class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length; //row
        int m=mat[0].length; //col

        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int splPos =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    splPos++;
                }
            }
        }
        return splPos;
    }
}
