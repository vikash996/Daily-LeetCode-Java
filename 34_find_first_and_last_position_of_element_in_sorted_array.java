class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                j=mid-1;

            }else if (nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;
        j=nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                i=mid+1;

            }else if (nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        
        return ans;
    }
}