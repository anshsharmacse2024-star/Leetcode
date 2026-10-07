class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int n=mat.length-1;
        int m=mat[0].length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=mat[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}