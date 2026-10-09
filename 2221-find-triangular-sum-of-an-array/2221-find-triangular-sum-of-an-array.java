class Solution {
    public int triangularSum(int[] nums) {
        
        int l=nums.length;
        int sum=0;
        if(l==1){
            return nums[0];
        }else{
            while(l>0){
                int[] newNums=new int[l];
                for(int i=0;i<l-1;i++){
                    sum=nums[i]+nums[i+1];
                    sum=sum%10;
                    newNums[i]=sum;
                }
                for(int i=0;i<l-1;i++){
                    nums[i]=newNums[i];
                }
                l--;
            }
            return sum;
        }
    }
}