class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            int j=0;
            ArrayList<Integer> arr=new ArrayList<>();
            while(j>=0 && j<s.length() && j<ans.length() && s.charAt(j)==ans.charAt(j)){
                j++;
            }
            ans=ans.substring(0,j);
        }
        return ans;
    }
}