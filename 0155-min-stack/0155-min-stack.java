class MinStack {
    Stack<Integer> mainstack;
    Stack<Integer>minstack;
    public MinStack() {
        mainstack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.size()==0||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        int remove=mainstack.pop();

    }
    
    public int top() {
        
    }
    
    public int getMin() {
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */