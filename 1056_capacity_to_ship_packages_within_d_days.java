class Solution {
    public int shipWithinDays(int[] w, int d) {
        int low = 0;
        int sum=0;
        for(int i=0; i<w.length; i++){
            low=Math.max(low,w[i]);
            sum+=w[i];
        }
        int high=sum;
        while(low<=high){
            int mid = low+(high-low)/2;
            int currwei = 0;
            int dayUsed = 1;
            for(int i=0; i<w.length; i++){
                if(currwei+w[i]<=mid){
                    currwei+=w[i];
                }else{
                    dayUsed++;
                    currwei=w[i];
                }
            }
            if(dayUsed>d){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;

    }
}