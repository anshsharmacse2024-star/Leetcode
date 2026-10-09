class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> output= new ArrayList<>();
        for(int a=0;a<=rowIndex;a++){
            ans.add(new ArrayList<>());
          }
        for(int i=0;i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }else{
                    int mid_val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(mid_val);
                }
            }
            if(i==rowIndex){
                output=ans.get(i);
            }
        }
        return output;
    }
}
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.set(0,100);

//         // System.out.println(list.get(0)); // prints 10
//         // System.out.println(list.contains(0)); 
//         System.out.println(list); 
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(20);
//         list.add(39);

//         for (int i = 0; i < list.size(); i++) {
//             System.out.print(list.get(i) + " ");
//         }
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         // var list = new ArrayList<>();
//         var list = new ArrayList<Integer>();
//         list.add(10);
//         list.add(20);
//         list.add("String");

//         System.out.print(list);
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         var list = new ArrayList<Integer>();
//         list.add(80);
//         list.add(20);
//         list.add(1,100);
//         // Collections.sort(list);
//         System.out.print(list);
//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(80);
//         list.add(2);
//         // list.add(10);
//         System.out.print(list.indexOf(80));
//     }
// }
