class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        // int count = 0 ;
        // int ele = 0;
        // for(int i = 0 ; i < arr.length; i++){
        //     if( arr[i] < target){
        //         count++;
        //     }
        //     else if( arr[i] == target){
        //         ele++;
        //     }
        // }
        // List<Integer> ans =  new ArrayList<>();
        // for(int i = 0 ;  i < ele ; i++){
        //     ans.add(count + i );
        // }
        // return ans;
        int count=0;
        int index=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<target){
                count++;
            }else if(arr[i]==target){
                index++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<index;j++){
            ans.add(count+j);
        }
        return ans;
    }
}