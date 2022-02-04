class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length < 1) {
            return 0;
        }

        //declare a stack
        Deque<Integer> stack = new ArrayDeque<>();
        for ( int i = 0; i < tokens.length; i++) {
            String curr = tokens[i];
            if (curr.equals("+") || curr.equals("-") ||
                    curr.equals("*") || curr.equals("/") ) { // check for operator
                //pop 2 elements out of the stack...
                //we should always have at least two in the stack per question...
                int second = stack.pop();
                int first = stack.pop();
                int compute = compute(curr, first, second);
                // push compute back onto the stack
                stack.push(compute);
            } else { //must be an int that needs to be pushed to the stack
                int num = Integer.valueOf(curr);
                stack.push(num);
            }
            //check what's on the stack
            //System.out.println("stack " + stack);
        }

        return stack.pop();
    }

    private int compute(String operator, int first, int second) {
        if (operator.equals("+")) {
            return first + second;
        } else if (operator.equals("-")) {
            return first - second;
        } else if (operator.equals("*")) {
            return first * second;
        } else if (operator.equals("/")) {
            return first / second;
        } else {
            throw new RuntimeException("not valid operator!");
        }
    }
}