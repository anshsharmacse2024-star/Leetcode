class Solution {
    public int countSubstrings(String s) {
        ArrayList<String> ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            check(s, i, i, count, ans);
            // if(check){
            //     count++;
            // }
            check(s, i, i+1, count, ans);
            // if(check){
            //     count++;
            // }
        }
        int l=ans.size();
        return l;
    }
    public void check(String s, int left, int right, int count, ArrayList<String> ans){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            String sub=s.substring(left, right+1);
            count++;
            ans.add(sub);
            left--;
            right++;
        }
    }
}