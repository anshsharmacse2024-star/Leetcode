class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
        int m=mat[0].length;
        int end=m*n-1;
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int r=mid/m;
            int c=mid%m;
            if(mat[r][c]==target){
                return true;
            }else if(mat[r][c]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}