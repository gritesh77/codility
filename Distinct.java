
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i< A.length; i++)
            hs.add(A[i]);
        
        return hs.size();
    }
}
