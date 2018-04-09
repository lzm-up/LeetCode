import java.util.Stack;


public class Question_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isValid(String s){
		int len = s.length();
		if(len%2!=0)
			return false;
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()){
			if(c == '(')
				stack.push(')');
			else if(c == '{')
				stack.push('}');
			else if(c == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
