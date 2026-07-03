class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ans.add(nums[i]);
        }
        int count=0;
        while(!isSorted(ans)){
            int Minsum=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0; i<ans.size()-1; i++){
                int sum = ans.get(i)+ans.get(i+1);
                if(sum<Minsum){
                    Minsum=sum;
                    idx=i;
                }
            }
            ans.set(idx , Minsum);
            ans.remove(idx+1);
            count++;

        }
        return count;

    }
    public boolean isSorted(List<Integer> ans){
        for(int i=0; i<ans.size()-1; i++){
            if(ans.get(i)>ans.get(i+1)){
            return false;
        }
        
        }
        return true;
    }

}