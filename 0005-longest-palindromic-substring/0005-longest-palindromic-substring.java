class Solution {
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        String[] ans = new String[1];
        for(int i=0;i<s.length();i++){
            String s2=check(s,i,i);
            if(max<s2.length()){
                max=s2.length();
                ans[0]=s2;
            }
            s2=check(s,i,i+1);
            if(max<s2.length()){
                max=s2.length();
                ans[0]=s2;
            }
        }
        return ans[0];
    }
    public String check(String s, int left, int right){
        int len=0;
        String sub="";
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            sub=s.substring(left, right+1);
            left--;
            right++;
        }
        return sub;
    }
}