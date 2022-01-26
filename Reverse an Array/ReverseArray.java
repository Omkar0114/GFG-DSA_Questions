
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int [] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
            }
            for (int j = N-1; j >=0 ; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
	}
}
