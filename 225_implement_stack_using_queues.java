class MyStack {
    Stack<Integer> st;
    int size;

    public MyStack() {
        st=new Stack<>();
        size=0;
        
    }
    
    public void push(int x) {
        st.push(x);
        size++;
        
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */