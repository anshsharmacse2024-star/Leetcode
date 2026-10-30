class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index=0;
        int[] arr= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[index]=nums1[i];
            index++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[index]=nums2[i];
            index++;
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        double ans=0.0;
        int mid=i+(j-i)/2;
        if(arr.length%2!=0){
            ans=(double)arr[mid];
            return ans;
        }else{
            ans=(arr[mid]+(double)arr[mid+1])/2;
            return ans;
        }

    }
}