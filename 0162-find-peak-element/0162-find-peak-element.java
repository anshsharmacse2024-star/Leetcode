class Solution {
    public int findPeakElement(int[] nums) {
        // int l=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     l=Math.max(l, nums[i]);
        // }
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]==l){
        //         return j;
        //     }
        // }
        // return -1;
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}