class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int unique = 0;
        
        for (int m :arr) {
            unique ^= m;
        }
        return unique;
    }
}
