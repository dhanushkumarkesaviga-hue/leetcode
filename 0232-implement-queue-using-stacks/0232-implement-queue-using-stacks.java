class MyQueue {
    Stack<Integer> queue1;
    Stack<Integer> queue2;

    public MyQueue() {
        queue1 = new Stack<>();
        queue2 = new Stack<>();
    }

    public void push(int x) {
        queue1.push(x);
    }

    public int pop() {
        if (queue2.isEmpty()) {
            while (!queue1.isEmpty()) {
                queue2.push(queue1.pop());
            }
        }

        return queue2.pop();
    }

    public int peek() {
        if (queue2.isEmpty()) {
            while (!queue1.isEmpty()) {
                queue2.push(queue1.pop());
            }
        }

        return queue2.peek();
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
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