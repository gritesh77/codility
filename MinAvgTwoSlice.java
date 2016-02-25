class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        double minAvg = 10000;
        int ret = 0;
        if (N > 2){
            for (int i = 0; i < N-2; i++){
                double avg = (A[i] +A[i+1])/2.0;
                if (avg < minAvg) {
                    minAvg = avg;
                    ret = i;
                }
                avg = (A[i] +A[i+1]+A[i+2])/3.0;
                if (avg < minAvg) {
                    minAvg = avg;
                    ret = i;
                }
            }
        }
        double avg = (A[N-2] +A[N-1])/2.0;
        if (avg < minAvg) {
            minAvg = avg;
            ret = N-2;
        }
        return ret;
    }
}
