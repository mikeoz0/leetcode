class MinStack {
    private final List<MinStackNode> list;

    public MinStack() {
        this.list = new ArrayList<>();
    }

    public void push(int val) {
        if (list.isEmpty()) {
            list.add(new MinStackNode(val, val));
        } else {
            list.add(new MinStackNode(val, Math.min(getMin(),val)));
        }
    }

    public void pop() {
        if (!list.isEmpty()) {
            list.remove(list.size()-1);
        } else {
            //throw exception
        }
    }

    public int top() {
        if (!list.isEmpty()) {
            return list.get(list.size() -1 ).val;
        } else {
            //throw exception
            throw new RuntimeException("stack cannot be empty");
        }
    }

    public int getMin() {
        if (!list.isEmpty()) {
            return list.get(list.size() -1 ).min;
        } else {
            //throw exception
            throw new RuntimeException("stack cannot be empty");
        }
    }
}

class MinStackNode {
    public int val;
    public int min;

    public MinStackNode(int val, int min) {
        this.val = val;
        this.min = min;
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