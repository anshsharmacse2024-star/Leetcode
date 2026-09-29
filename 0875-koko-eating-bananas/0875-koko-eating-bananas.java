class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int mid=0;
        // int ans=Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high, piles[i]);
        }
        while(low<=high){
            mid=low+(high-low)/2;
            long count=0;
            for(int j=0;j<piles.length;j++){
                int n=piles[j]/mid;
                int m=piles[j]%mid;
                count=count+n;
                if(m!=0){
                    count++;
                }
            }
            // if(count==h){
            //     ans=Math.min(mid,ans);
            // }
            if(count<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}