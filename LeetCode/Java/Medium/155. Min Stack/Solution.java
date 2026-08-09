class MinStack {
    Stack<Long>st;
    long min;
    public MinStack() {
        st=new Stack<>();
    }

    public void push(long val) {
        if(st.size()==0){
            st.push(val);
            min=val;
        }
        else if(val<min){
            st.push(2*val-min);
            min=val;
        }
        else st.push(val);
    }

    public void pop() {
       if(st.peek()<min) min=2*min-st.peek();
       st.pop();
    }

    public int top() {
        if(st.peek()<min) return (int)min;
        return (int)(long)st.peek();
    }

    public int getMin() {
        return (int) min;
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