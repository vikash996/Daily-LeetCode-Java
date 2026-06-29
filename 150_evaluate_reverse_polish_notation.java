class Solution {
    public int evalRPN(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            String ch = arr[i];
            if(ch.equals("+")){
                int sec = st.pop();
                int first = st.pop();
                int res = first+sec;
                st.push(res);
            }
            else if(ch.equals("*")){
                int sec = st.pop();
                int first = st.pop();
                int res = first*sec;
                st.push(res);
            }
            else if(ch.equals("-")){
                int sec = st.pop();
                int first = st.pop();
                int res = first-sec;
                st.push(res);
            }
            else if(ch.equals("/")){
                int sec = st.pop();
                int first = st.pop();
                int res = first/sec;
                st.push(res);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
        
    }
}