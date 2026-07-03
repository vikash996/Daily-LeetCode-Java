class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }
        int second = 0;
        while(!q.isEmpty()){
            int idx = q.remove();
            tickets[idx]--;
            second++;
            if(tickets[idx]==0){
                if(idx==k) return second;
            }else{
                q.add(idx);
            }
        }
        return second;
        
    }
}