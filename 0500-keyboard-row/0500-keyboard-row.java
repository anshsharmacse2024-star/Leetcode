class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result=new ArrayList<>();
        // StringBuilder str=new StringBuilder();
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";
        String ans="";
        boolean status=true;
        for(int j=0;j<words.length;j++){
            String s=words[j];
            status=true;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                   ch=Character.toLowerCase(s.charAt(i));

                }
                if(i==0 && first.indexOf(ch)!=-1){
                    ans=first;
                    
                }
                else if(i==0 && second.indexOf(ch)!=-1){
                    ans=second;
                    
                }
                else if(i==0 && third.indexOf(ch)!=-1){
                    ans=third;
                    
                }
                if(ans.indexOf(ch)==-1){
                    status=false;
                    break;
                }
            }
            if(status){
                result.add(s);
            }
        }
       return result.toArray(new String[0]);
    }
}