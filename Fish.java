import java.util.*;

public class Fish {

	class Solution {
		public int solution(int[] A, int[] B) {
			Stack<Integer> s = new Stack<Integer>();

			for (int i = 0; i < A.length; i++) {
				int size = A[i];
				int dir = B[i];
				if (s.empty()) {
					s.push(i);
				} else {
					while (!s.empty() && dir - B[s.peek()] == -1
							&& A[s.peek()] < size) {
						s.pop();
					}
					if (!s.empty()) {
						if (dir - B[s.peek()] != -1)
							s.push(i);
					} else {
						s.push(i);
					}
				}
			}
			return s.size();
		}
	}

	public static void main(String args[]) {
		Fish s = new Fish();
		System.out.println(">>>>>"
				+ s.solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0,
						0, 0 }));

	}
}
