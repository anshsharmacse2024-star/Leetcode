class Solution {
    public int smallestIndex(int[] arr) {
        int small=Integer.MAX_VALUE;
        int i=0;
        
        while(i<arr.length){
            int sum=0;
            while(arr[i]>0){
                
                int m=arr[i]%10;
                sum=sum+m;
                arr[i]=arr[i]/10;
            }
            if(sum==i){
                return i;
            }else{
                i++;
            }
            

        }
        return -1;
    }
}