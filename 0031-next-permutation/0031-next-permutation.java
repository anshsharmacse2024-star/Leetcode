class Solution {
    public void nextPermutation(int[] nums) {
        boolean status=false;
        int x=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                // int temp=nums[i];
                // nums[i]=nums[i+1];
                // nums[i+1]=temp; //3,2,1
                status=true;
                x=i;
                break;
            }

        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int y=0;
        if(status){
            for(int i=x+1;i<nums.length;i++){
                if(nums[i]>nums[x]){
                    max=nums[i];
                   if(max<=min){
                    min=max;
                    y=i;
                   }
                }
            }
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;

        }
        if(status==true){
            int i=x+1;
            int j=nums.length-1;
            while(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }else{
            int i=0;
            int j=nums.length-1;
            while(i<=j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    }
}