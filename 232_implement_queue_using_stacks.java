class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    int size;
    public MyQueue() {


        size=0;
    }
    
    public void push(int x) {
        st1.push(x);
        size++;
    }
    
    public int pop() {
        while(st1.size()>1){
            helper.push(st1.pop());
        }
        int front = st1.pop();
        while(helper.size()>0){
            st1.push(helper.pop());
        }
        return front;
         
        
    }
    
    public int peek() {
        while(st1.size()>1){
            helper.push(st1.pop());
        }
        int front  = st1.peek();
        while(helper.size()>0){
            st1.push(helper.pop());
        }
        return front;
    }
    
    public boolean empty() {
        if(st1.size()==0){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */