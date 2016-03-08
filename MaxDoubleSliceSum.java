// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Codlity URL: https://codility.com/demo/results/trainingEJQ2KK-GJR/

class MaxDoubleSliceSum {
    public int solution(int[] A) {
        int[] P = new int[A.length];
        int[] Q = new int[A.length];
        for (int i = 1; i<A.length; i++){
            P[i] = Math.max(0, P[i-1]+A[i]);
        }
        for (int i = A.length-2; i >= 0;i--){
            Q[i] = Math.max(0, Q[i+1]+A[i]);
        }
        int maxSum = -10000;
        for (int i = 1; i<A.length-1; i++){
            maxSum = Math.max(maxSum, P[i-1]+Q[i+1]);  
        }
        
        // write your code in Java SE 8
        return maxSum;
    }
}