class Solution {
    public int[] finalPrices(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        ans[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
                if(st.isEmpty()){
                    ans[i]=arr[i];
                }else{
                    ans[i]=arr[i]-st.peek();
                }
            st.push(arr[i]);
        }
        return ans;
    }
}