class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        if (deadends == null || deadends.length < 1) {
            return -1;
        }

        Set<String> set = new HashSet<>();

        for (String s : deadends) {
            if (s.equals("0000")) {
                return -1;
            }
            set.add(s);
        }

        Deque<String> q = new ArrayDeque<>();
        int count = 0;
        //put first element in q?
        q.offer("0000");
        //System.out.println(" intial q " + q);
        //implement a bfs (n-ary)
        while (!q.isEmpty()) {
            //size
            int size = q.size();

            for (int i = 0; i <size; i++ ) {
                String curr = q.poll(); //0000

                if (curr.equals(target)) {
                    return count;
                }
                // 4 different ways to move forward:::

                for (int j = 0; j < 4; j++) {
                    int currInt = Character.getNumericValue(curr.charAt(j));

                    StringBuilder strB = new StringBuilder(curr);
                    strB.setCharAt(j, Character.forDigit(currInt + 1, 10));
                    String newCombo1 = strB.toString();
                    if (!set.contains(newCombo1)) {
                        q.offer(newCombo1);
                        set.add(newCombo1);
                    }

                    // if
                    int rollBackNum = currInt == 0 ? 9 : currInt - 1;
                    strB.setCharAt(j, Character.forDigit(rollBackNum, 10));
                    String newCombo2 = strB.toString();
                    if (!set.contains(newCombo2)) {
                        q.offer(newCombo2);
                        set.add(newCombo2);
                    }
                    //System.out.println(" currInt " + currInt);
                    //System.out.println(" q " + q);
                }
            }

            count++;
            //System.out.println("count " + count);
        } //end of while
        return -1;
    }
}