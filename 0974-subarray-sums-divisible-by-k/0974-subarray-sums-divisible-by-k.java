class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int l=nums.length;
        // int count=0;
        // int i=0;
        // // for(int i=0;i<l;i++){
        // while(i<l){
        //     int sum=0;
        //     for(int j=i;j<l;j++){
        //         sum+=nums[j];
        //         if(sum%k==0){
        //             count++;
        //         }
        //     }
        //     i++;
        // }
        // return count;

        int sum=0;
        int count=0;
        int[] freq=new int[k];
        freq[0]=1;
        for(int i=0;i<nums.length;i++){
            sum = ((sum + nums[i]) % k + k) % k;
            count=count+freq[sum];
            freq[sum]++;
        }
        return count;
    }
}