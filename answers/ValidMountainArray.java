class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 2){
            return false;
        }

        //find the max:
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            max = Math.max(num, max);
        } // run in o(n)

        if (arr[0] == max || arr[arr.length-1] == max) { //check if max is not at beg, or end
            return false;
        }

        int prev = arr[0];
        boolean isUpSlope = true;

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; //3

            //upSlope scenario
            if (curr > prev && isUpSlope == true) {
                //check if we hit max...
                if (max == curr) {
                    isUpSlope = false;
                }
                prev = curr;
                continue;
            } else if(curr <= prev && isUpSlope == true) {
                return false;
            }

            //downSlope scenario
            if (curr < prev && isUpSlope == false) {
                prev = curr;
                continue;
            } else if (curr >= prev && isUpSlope == false){
                return false;
            }
        }

        return true;
    }
}