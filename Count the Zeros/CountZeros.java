class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

}
