// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// Codility URL: https://codility.com/demo/results/trainingH6HWC2-XKN/
class MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int minPrice = A[0];
        int maxProfit = 0;
        for (int i = 0; i< A.length; i++){
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            minPrice = Math.min(A[i], minPrice);
        }
        return maxProfit;
    }
}