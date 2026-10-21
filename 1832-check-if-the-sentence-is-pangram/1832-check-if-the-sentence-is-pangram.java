class Solution {
    public boolean checkIfPangram(String s) {
        boolean ans=false;
        for(int i=1;i<=26;i++){
            char ch= (char) (i+96);
            if(!s.contains(ch+"")){
                return false;
            }
        }
        return true;
    }
}