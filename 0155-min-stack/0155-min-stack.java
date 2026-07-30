class MinStack {
    int stack[] = new int[300000];
    int top = -1;
    int arr[] = new int[300000];
    int t = -1;

    public MinStack() {

    }

    public void push(int value) {
        stack[++top] = value;
        if (t ==-1 ||arr[t] >= value) {
            arr[++t] = value;
        }
    }

    public void pop() {

        if (arr[t] == stack[top]) {
            t--;
            top--;
        } else {
            top--;
        }
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        return arr[t];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */