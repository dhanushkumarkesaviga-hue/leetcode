class DinnerPlates {
    int capacity;
    ArrayList<Stack<Integer>> list = new ArrayList<>();
    TreeSet<Integer> pq = new TreeSet<>();

    public DinnerPlates(int capacity) {
        this.capacity = capacity;
    }

    public void push(int val) {

        while (!pq.isEmpty() &&
               (pq.first() >= list.size() ||
                list.get(pq.first()).size() >= capacity)) {
            pq.remove(pq.first());
        }

        if (!pq.isEmpty()) {

            int top = pq.first();
            pq.remove(top);

            Stack<Integer> st = list.get(top);
            st.push(val);

            if (st.size() < capacity) {
                pq.add(top);
            }

        }  else {
    Stack<Integer> stack = new Stack<>();
    stack.push(val);
    list.add(stack);
    if (stack.size() < capacity) {
        pq.add(list.size() - 1);
    }
}
    }

    public int pop() {

        while (!list.isEmpty() && list.getLast().isEmpty()) {
            list.remove(list.size() - 1);
        }

        if (list.isEmpty()) {
            return -1;
        }

        int index = list.size() - 1;

        Stack<Integer> st = list.get(index);
        int value = st.pop();

        if (st.size() < capacity) {
            pq.add(index);
        }

        return value;
    }

    public int popAtStack(int index) {

        if (index < 0 || index >= list.size()) {
            return -1;
        }

        Stack<Integer> st = list.get(index);

        if (st.isEmpty()) {
            return -1;
        }

        int value = st.pop();
        pq.add(index);

        return value;
    }
}