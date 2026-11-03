class Solution {
    public String mergeAlternately(String w1, String w2) {
        int n=w1.length();
        int m=w2.length();
        int max=Math.max(n, m);
        StringBuilder merge=new StringBuilder();
        for(int i=0;i<max;i++){
            if(i<n){
                merge.append(w1.charAt(i));
            }
            if(i<m){
                merge.append(w2.charAt(i));
            }
        }
        return merge.toString();
    }
}