class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ans.add(nums[i]);
        }
        int[] arr = new int[nums.length];
        int idx=0;
        for(int i=0; i<ans.size();){
            if(ans.get(i)%2==0){
                arr[idx++]=ans.get(i);
                ans.remove(i);
            }else{
                i++;
            }
        }
        for(int i=0; i<ans.size(); i++){
            arr[idx++]=ans.get(i);
        }
        return arr;
    }
}