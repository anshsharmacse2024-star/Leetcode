class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;
        int[][] ans = new int[n][m];
        int[][] dir = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=img[i][j];
                int count=1;
                for(int k=0;k<8;k++){
                    int ni=i+dir[k][0];
                    int nj=j+dir[k][1];
                    if(ni>=0 && ni<n && nj>=0 && nj<m){
                        sum+=img[ni][nj];
                        count++;
                    }
                }
                ans[i][j]=sum/count;
            }
        }
        return ans;
    }
}