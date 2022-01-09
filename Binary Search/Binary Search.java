
class Solution {
    int binarysearch(int arr[], int n, int k){
        // code here
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <=end) {
            int mid = start + (end - start) /2;
            
            if (k < arr[mid]) {
                end = mid -1;
            } else if (k > arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
