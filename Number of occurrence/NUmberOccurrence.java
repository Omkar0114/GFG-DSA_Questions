class Solution {
    static int count(int[] arr, int n,int x) {
        // code here

        int count = 0;
        for(int i =0; i<=arr.length-1; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
}
