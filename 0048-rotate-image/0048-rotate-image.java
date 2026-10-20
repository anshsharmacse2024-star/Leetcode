class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++){
            int left=0;
            int rigth=r-1;
            while(left<rigth){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][rigth];
                matrix[i][rigth]=temp;
                left++;
                rigth--;
            }
        }
    }
}