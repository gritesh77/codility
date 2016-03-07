// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int p = -1000000; // set to min possible number encountered
        int q = p;
        for (int i = 0; i< A.length; i++){
            p = Math.max(A[i], p + A[i]);
            q = Math.max(p,q);
        }
        return q;
    }
}