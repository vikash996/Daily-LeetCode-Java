class Solution {
    public int jump(int[] nums) {
        int currEnd = 0;
        int maxreach = 0;
        int jump=0;
        for(int i=0; i<nums.length-1; i++){
            maxreach = Math.max(maxreach,i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=maxreach;
            }
            
        }
        return jump;
    }
}