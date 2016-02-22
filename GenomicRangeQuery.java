class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        char[] charS = S.toCharArray();
        int[] placesA = new int[charS.length];
        int[] placesB = new int[charS.length];
        int[] placesC = new int[charS.length];
        int[] placesD = new int[charS.length];
        int[] ret = new int[P.length];
        int M = P.length;
        int N = charS.length;
        int lastA = -1;
        for (int i = 0; i< N; i++){
            if (charS[i] == 'A'){
                placesA[i] = i;
                if (i > 0){
                    placesB[i] = placesB[i-1];
                    placesC[i] = placesC[i-1];
                    placesD[i] = placesD[i-1];
                } else 
                    placesA[i] = -1;
            } else if (charS[i] == 'C') {
                placesB[i] = i;
                if (i > 0){
                    placesA[i] = placesA[i-1];
                    placesC[i] = placesC[i-1];
                    placesD[i] = placesD[i-1];
                } else 
                    placesB[i] = -1;
            } else if (charS[i] == 'G') {
                placesC[i] = i;
                if (i > 0){
                    placesB[i] = placesB[i-1];
                    placesA[i] = placesA[i-1];
                    placesD[i] = placesD[i-1];
                } else 
                    placesC[i] = -1;
            } else if (charS[i] == 'T') {
                placesD[i] = i;
                if (i > 0){
                    placesB[i] = placesB[i-1];
                    placesC[i] = placesC[i-1];
                    placesA[i] = placesA[i-1];
                } else 
                    placesD[i] = -1;
            }
        }
        for (int i = 0; i<M; i++){
            
            //System.out.println(">>"+placesA[Q[i]]+">>");
            if (placesA[Q[i]] >= P[i])
                ret[i] = 1;
            else if (placesB[Q[i]] >= P[i])
                ret[i] = 2;
            else if (placesC[Q[i]] >= P[i])
                ret[i] = 3;
            else if (placesD[Q[i]] >= P[i])
                ret[i] = 4;
        }
        return ret;
    }
}
