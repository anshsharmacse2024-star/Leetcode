class Solution {
    public String defangIPaddr(String a) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                ans.append("[.]");
            }else{
                ans.append(a.charAt(i));
            }
        }
        return ans.toString();
    }
}