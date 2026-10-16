class Solution {

     public void swap( int l , int r , int[] nums){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
     }

    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while( mid <= right){
            if(nums[mid] == 0){
                swap( left , mid , nums);
                left++;
                mid++;
            }
            else if( nums[mid] == 1 ){
                mid++;
            }
            else{ // mid == 2 
                swap( right , mid , nums);
                right--;
            }   
        }
    }
}