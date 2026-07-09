class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n=ast.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            int curr = ast[i];
            boolean alive = true;
            while(alive &&!st.isEmpty() && st.peek()>0 && curr<0){
                if(Math.abs(st.peek()) < Math.abs(curr)){
                    st.pop();
                    
                }else if (Math.abs(st.peek()) == Math.abs(curr)){
                    st.pop();
                    alive=false;
                    
                }else{
                    alive=false;
                }
            }
            if(alive){
                st.push(curr);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i]=st.pop();
        }
        return ans;
        
    }
}