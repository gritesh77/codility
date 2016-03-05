import java.util.Stack;

public class Dominator {
	public int solution(int[] A) {
		// write your code in Java SE 8
		Stack s = new Stack();
		for (int i = 0; i < A.length; i++) {
			if (s.isEmpty()) {
				s.push(A[i]);
				continue;
			}
			if (A[i] != (int) s.peek())
				s.pop();
		}
		if (s.isEmpty())
			return -1;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == (int) s.peek())
				count++;
		}
		if (count > A.length / 2) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] == (int) s.peek())
					return i;
			}
		}

		return -1;

	}
}
