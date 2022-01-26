class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length < 1) {
            return 0;
        }

        Deque <int[]> q = new ArrayDeque<>();
        Set <String> set = new HashSet<>();
        List<int[]> list = new ArrayList<>();

        //how do we know where to start?
        //go through and find first coordinate? Because we need to add the root
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char curr = grid[i][j];
                if (curr == '1') { //hit land!
                    list.add(new int []{i, j});
                }
            }
        }

        int count = 0;

        for (int k = 0; k < list.size(); k++) {
            int [] coorFromList = list.get(k);
            if(!set.contains(toStringArr(coorFromList))) {
                q.offer(coorFromList);
                set.add(toStringArr(coorFromList));
            } else {//skip this one
                continue;
            }


            while (!q.isEmpty()) {

                int size = q.size();
                //System.out.println(" q size " + q.size());

                for (int i = 0; i < size; i++) {
                    int [] currCoor = q.poll();
                    //System.out.println(" currCoor " + Arrays.toString(currCoor));

                    char curr = grid[currCoor[0]][currCoor[1]];
                    if (curr == '1') { //hit land!
                        //loop up (subtract 1 from i)
                        if (currCoor[0] > 0) {
                            //first need to check if its unvisited.
                            int [] coor = new int[]{currCoor[0]-1, currCoor[1]};
                            if(!set.contains(toStringArr(coor))) {
                                q.offer(new int[]{currCoor[0]-1, currCoor[1]});
                                set.add(toStringArr(coor));
                            }
                        }
                        //look down
                        if (currCoor[0]+1 < grid.length) {
                            //first need to check if its unvisited.
                            int [] coor = new int[]{currCoor[0]+1, currCoor[1]};
                            if(!set.contains(toStringArr(coor))) {
                                q.offer(new int[]{currCoor[0]+1, currCoor[1]});
                                set.add(toStringArr(coor));
                            }
                        }
                        //look left
                        if (currCoor[1] > 0) {
                            //first need to check if its unvisited.
                            int [] coor = new int[]{currCoor[0], currCoor[1]-1};
                            if(!set.contains(toStringArr(coor))) {
                                q.offer(new int[]{currCoor[0], currCoor[1]-1});
                                set.add(toStringArr(coor));
                            }
                        }

                        //look right
                        if (currCoor[1]+1 < grid[0].length) {
                            //first need to check if its unvisited.
                            int [] coor = new int[]{currCoor[0], currCoor[1]+1};
                            if(!set.contains(toStringArr(coor))) {
                                q.offer(new int[]{currCoor[0], currCoor[1]+1});
                                set.add(toStringArr(coor));
                            }
                        }
                    }
                }
            }
            count +=1;
        }

        return count;
    }

    private String toStringArr(int []arr) {
        return String.valueOf(arr[0] + "," + arr[1]);
    }
}