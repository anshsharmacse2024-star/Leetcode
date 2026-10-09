class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
          for(int i=0;i<numRows;i++){
            ans.add(new ArrayList<>());
          }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }else{
                    int mid_value=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(mid_value);
                }
            }
        }
        return ans;
    }
}