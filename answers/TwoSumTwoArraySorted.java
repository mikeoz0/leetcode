class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int []{};
        }

        int i = 0;
        int j = numbers.length- 1;

        while (i < j) {
            int iVal = numbers[i];
            int jVal = numbers[j];

            int sum = iVal + jVal;
            //System.out.println("sum " +sum);

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                //inc i
                i++;
            } else {
                //dec j
                j--;
            }
        }

        return null;
    }
}