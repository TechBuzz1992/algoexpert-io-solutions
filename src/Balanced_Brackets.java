import java.util.Stack;

public class Balanced_Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isBalanced(String string) {
		Stack<Character> st = new Stack<>();
		for(char a : string.toCharArray()) {
			if(a == '(' || a == '[' || a == '{') {
				st.push(a);
			}else if(st.peek() == '(' && a == ')') {
				st.pop();
			}else if(st.peek() == '[' && a == ']') {
				st.pop();
			}else if(st.peek() == '{' && a == '}') {
				st.pop();
			}else {
				st.push(a);
			}
		}
		return st.isEmpty();
	}

}
