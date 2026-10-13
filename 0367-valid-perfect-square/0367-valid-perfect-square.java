class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high=num;
        if(num<=1){
            return true;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            long x=mid*mid;
            if(x==num){
                return true;
            }else if(x>num){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}