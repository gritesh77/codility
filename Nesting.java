import java.util.Stack;

public class Nesting {

	public int solution(String S) {
		// write your code in Java SE 8
		Stack s = new Stack();
		char[] c = S.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				s.push(c[i]);
				continue;
			}
			if (c[i] == ')') {
				if (s.isEmpty()
						|| ! ((char)s.peek()== '(')) {
					return 0;
				} else
					s.pop();
			}
		}

		return 1;
	}
}