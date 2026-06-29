class Solution {
    public int helper(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }    
}