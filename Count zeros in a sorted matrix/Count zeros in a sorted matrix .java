class GfG
{
    /*you are required to complete this method*/
    static int countZeros(int Arr[][], int N) {
        int col = 0 ,row = 0, count =0;

        while (row < N && col <N) {

            if (Arr[row][col] == 0) {
                count++;
            }
            col++;

            if (col == (N)) {
                row++;
                col =0;
            }
        }
        return count;
    }
}
