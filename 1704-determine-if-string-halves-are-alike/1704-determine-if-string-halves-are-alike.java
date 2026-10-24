class Solution {
    public boolean halvesAreAlike(String s) {
        int half=s.length()/2;
        int c=0;
        String v="aeiouAEIOU";
        for(int i=0;i<half;i++){
            if(v.contains(s.charAt(i) +"")){
                c++;
            }
        }
        for(int i=half;i<s.length();i++){
            if(v.contains(s.charAt(i) +"")){
            c--;
            }
        }
        if(c==0){
            return true;
        }
        return false;
    }
}