class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                maxi=Math.max(maxi,count);
            }else if(ch==')'){
                count--;
            }
        }
        // if(maxi==0){
        //     return 0;
        // }
        return maxi;
    }
}