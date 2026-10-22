class Solution {
    public String firstPalindrome(String[] words) {
        for(String str: words){
            boolean ans=true;
            int l=0;
            int r=str.length()-1;
            while(l<r){
                if(str.charAt(l)!=str.charAt(r)){
                    ans=false;
                    break;
                }
                l++;
                r--;
            }
            if(ans==true){
                return str;
            }
        }
        return "";
    }
}