
public class RemoveOuterParenthesis {
	
	static String removeOuterParentheses(String s) {
		StringBuilder t = new StringBuilder();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0) t.append(c);
            if (c == ')' && opened-- > 1) t.append(c);
        }
        return t.toString();
    }

	public static void main(String[] args) {
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));
	}

}
