class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            int count=0;
            int[] freq=new int[127];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                int index=ch;
                freq[index]++;
                if(freq[index]==2){
                    // freq=null;
                    break;
                }else{
                    count++;
                    max=Math.max(count, max);
                }

            }
        }
        return max;
    }
}