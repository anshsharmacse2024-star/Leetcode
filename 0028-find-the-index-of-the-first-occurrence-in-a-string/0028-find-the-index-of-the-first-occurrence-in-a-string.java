// class Solution {
//     public int strStr(String h, String n) {
        // boolean status=h.contains(n);
        // if(!status) return -1;

        // for(int i=0;i<h.length();i++){
        //     for(int j=i;j<h.length();j++){
        //         String sub=h.substring(i,j+1);
        //         boolean status=false;
        //         if(n.length()==sub.length() && sub.contains(n)){
        //             status=true;
        //         }
        //         if(status){
        //             return i;
        //         }
        //     }
        // }
        // return -1;
//     }
// }
class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<h.length()-n.length()+1;i++){
            String sub=h.substring(i,i+n.length());
             if(n.length()==sub.length() && sub.contains(n)){
                return i;
            }
        }
        return -1;
    }
}