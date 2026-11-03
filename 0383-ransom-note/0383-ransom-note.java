class Solution {
    public boolean canConstruct(String r, String m) {
        int[] freq=new int[26];
        for(int i=0;i<m.length();i++){
            int ch=m.charAt(i)-97;
            freq[ch]++;
        }
        for(int j=0;j<r.length();j++){
            int ch=r.charAt(j)-97;
            if(freq[ch]==0){
                return false;
            }
            freq[ch]--;
        }
        return true;
    }
}