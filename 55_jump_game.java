class Solution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length-1;
        int maxreach = 0;
        for(int i=0; i<nums.length; i++){
            int currIndx = i;
            if(currIndx > maxreach){
                return false;
            }
            maxreach = Math.max(maxreach,i+nums[i]);
            if(maxreach>=lastIndex){
                return true;
            }
            
        }
        return true;
    }
}