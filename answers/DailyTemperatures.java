class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if ( temperatures == null || temperatures.length < 1) {
            return new int []{};
        }

        int [] ans = new int [temperatures.length];
        //System.out.println(" begin ans " + Arrays.toString(ans));

        Deque<Node> q = new ArrayDeque<>();

        for ( int i = 0; i < temperatures.length; i ++) {
            int curr = temperatures[i];
            //System.out.println(" curr " + curr);
            //add to stack?
            if (q.isEmpty()) {
                q.push(new Node (curr, i));
                //break;
            } else {
                //be a while loop?
                while (!q.isEmpty()) {
                    Node temp = q.peekFirst();
                    //System.out.println(" temp " + temp);
                    if (temp.val < curr) {
                        //found a high temp
                        ans[temp.index] = i - temp.index;
                        q.pop();
                    } else {
                        break;
                    }
                }
                q.push(new Node(curr, i));

            }
            //System.out.println("q " + q);

            //System.out.println("mid ans " + Arrays.toString(ans));
        }

        //System.out.println("final ans " + Arrays.toString(ans));
        return ans;
    }
}

class Node {
    public int val;
    public int index;
    public Node(int val, int index){
        this.val = val;
        this.index = index;
    }

    public String toString(){
        return "val " + val + " index: " +index;
    }
}