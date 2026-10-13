class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int sum=0;
        for(int i=1;i<=l;i++){
            if(l%i==0){
                sum+=nums[i-1]*nums[i-1];
            }
        }
        return sum;
    }
}