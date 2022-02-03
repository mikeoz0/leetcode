class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() < 1){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        boolean isStackEverPopulated = false;
        for (int i = 0 ; i < s.length(); i++ ) {
            //System.out.println("stack  "+ stack);
            char c = s.charAt(i);
            //System.out.println("c  "+ c);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (c == ')') {
                if(stack.isEmpty()) return false;
                char poppedChar = stack.pop();
                if (poppedChar != '(' ) return false;
            } else if (c == '}') {
                if(stack.isEmpty()) return false;
                char poppedChar = stack.pop();
                if (poppedChar != '{' ) return false;

            } else if (c == ']'){
                if(stack.isEmpty()) return false;
                char poppedChar = stack.pop();
                if (poppedChar != '[' ) return false;
            }

        }

        return stack.isEmpty();
    }
}