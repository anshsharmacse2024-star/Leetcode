class Solution {
    public boolean judgeSquareSum(int c) {
        boolean ans=true;
        long low=1;
        long high=(long) Math.sqrt(c);;
        if(c<=1){
            return ans;
        }
        while(low<=high){
            long x=low*low + high*high;
            if(x==c){
                return true;
            }else if(x>c){
                high--;
            }else{
                low--;
            }
        }
        ans=false;
        return ans;
    }
}