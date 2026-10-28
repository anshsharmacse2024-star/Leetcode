// class Solution {
//     public int search(int[] nums, int target) {
//          int str=0;
//         int end=nums.length-1;
//         while(str<=end){
//             int mid=str+(end-str)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }else if(nums[mid]>target){
//                 end=mid-1;
//             }else{
//                 str=mid+1;
//             }
//         }
//         return -1;
        
//     }
// }
class Solution {
    public int search(int[] arr, int t) {
        return Binarysearch(0, arr.length - 1, arr, t);
    }

    public int Binarysearch(int left, int right, int[] arr, int t) {
        if (right < left) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == t) {
            return mid;
        }

        if (arr[mid] < t) {
            return Binarysearch(mid + 1, right, arr, t);
        } else {
            return Binarysearch(left, mid - 1, arr, t);
        }
    }
}