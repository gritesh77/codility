import java.util.Stack;

class SolutionBrackets {
	public int solution(String S) {
		// write your code in Java SE 8
		Stack<String> st = new Stack<String>();
		for (char c : S.toCharArray()) {
			System.out.println(c + (st.isEmpty() ? "" : st.peek()));
			if ((c == ')' && st.peek().toCharArray()[0] == '(')
					|| (c == '}' && st.peek().toCharArray()[0] == '{')
					|| (c == ']' && st.peek().toCharArray()[0] == '[')) {
				st.pop();
				continue;
			}
			if ((c == ')' && st.pop().toCharArray()[0] != '(')
					|| (c == '}' && st.pop().toCharArray()[0] != '{')
					|| (c == ']' && st.pop().toCharArray()[0] != '[')) {
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+c + (st.isEmpty() ? "" : st.peek()));
				return 0;
			} else
				st.push(c+"");
		}
		return 1;
	}

	public static void main(String args[]) {
		SolutionBrackets s = new SolutionBrackets();
		
		
		System.out.println(">>>>>"+s.solution("{[()()]}"));

	}
}