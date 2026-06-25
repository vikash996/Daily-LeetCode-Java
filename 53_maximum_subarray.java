class Solution {
    public int maxSubArray(int[] a) {
        int curr_sum =0;
        int max = a[0];
        for(int i=0; i<a.length; i++){
            curr_sum = curr_sum+a[i];
            if(curr_sum>max){
                max=curr_sum;
            }
             if(curr_sum<0){
            curr_sum=0;
        }
    }
       
        return max;
    }
}