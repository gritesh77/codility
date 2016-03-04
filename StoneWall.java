import java.util.Stack;

//https://codility.com/demo/results/training8VNJYT-47X/
public class StoneWall {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack s = new Stack();
        int count = 0;
        for (int i = 0; i < A.length; i++){
            if (s.isEmpty() || A[i] > (int)s.peek()) {
                s.push(A[i]);
                continue;
            }
            boolean push = false;
            while (!s.isEmpty() && A[i] < (int)s.peek()) {
                //System.out.println("test"+s +">>>"+ A[i]);
                int a = (int)s.pop();
                //System.out.println("popped "+a+">>>"+ A[i]);
                count++;
                push = true;
            }
            if (push && (s.isEmpty() || A[i] != (int)s.peek())) s.push(A[i]);
        }      
        //System.out.println(s + ">>" + count);
        return count+s.size() ;
    }

}
