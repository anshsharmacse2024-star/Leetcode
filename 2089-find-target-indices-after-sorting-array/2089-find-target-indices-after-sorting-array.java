class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int count = 0 ;
        int ele = 0;
        for(int i = 0 ; i < arr.length; i++){
            if( arr[i] < target){
                count++;
            }
            else if( arr[i] == target){
                ele++;
            }
        }
        List<Integer> ans =  new ArrayList<>();
        for(int i = 0 ;  i < ele ; i++){
            ans.add(count + i );
        }
        return ans;
    }
}